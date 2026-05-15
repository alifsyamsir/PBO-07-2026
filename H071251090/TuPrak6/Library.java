package TuPrak6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    private List<LibraryItem> items;
    private List<Member> members;
    private LibraryLogger logger;
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
        this.logger = new LibraryLogger();
    }

    public String addItem(LibraryItem item) {
        items.add(item);
        return item.getTitle() + " berhasil ditambahkan";
    }

    public String addMember(Member member) {
        members.add(member);
        return "Anggota " + member.getName() + " berhasil ditambahkan";
    }

    public LibraryItem findItemById(int itemId) {
        for (LibraryItem item : items) {
            if (item.getItemId() == itemId) return item;
        }
        throw new NoSuchElementException("Item dengan ID " + itemId + " tidak ditemukan.");
    }

    public Member findMemberById(int memberId) {
        for (Member m : members) {
            if (m.getMemberId() == memberId) return m;
        }
        throw new NoSuchElementException("Anggota dengan ID " + memberId + " tidak ditemukan.");
    }

    public String borrowItem(int memberId, int itemId, int days) {
        Member member = findMemberById(memberId);
        LibraryItem item = findItemById(itemId);
        String result = member.borrow(item, days);
        String timestamp = LocalDateTime.now().format(FORMATTER);
        logger.logBorrow(timestamp, item.getTitle(), member.getName());
        return result;
    }

    public String returnItem(int memberId, int itemId, int daysLate) {
        Member member = findMemberById(memberId);
        LibraryItem item = findItemById(itemId);
        String result = member.returnItem(item, daysLate);
        String returnTime = LocalDateTime.now().format(FORMATTER);
        logger.logReturn(item.getTitle(), member.getName(), returnTime);
        return result;
    }

    public String getLibraryStatus() {
        if (items.isEmpty()) return "Tidak ada item di perpustakaan.";

        int idW = 6, titleW = 30, statusW = 12;
        String border = "+" + "-".repeat(idW) + "+" + "-".repeat(titleW) + "+" + "-".repeat(statusW) + "+";
        StringBuilder sb = new StringBuilder();
        sb.append(border).append("\n");
        sb.append(String.format("| %-" + (idW - 2) + "s | %-" + (titleW - 2) + "s | %-" + (statusW - 2) + "s |%n",
                "ID", "Judul", "Status"));
        sb.append(border).append("\n");
        for (LibraryItem item : items) {
            sb.append(String.format("| %-" + (idW - 2) + "d | %-" + (titleW - 2) + "s | %-" + (statusW - 2) + "s |%n",
                    item.getItemId(), item.getTitle(),
                    item.isBorrowed() ? "Dipinjam" : "Tersedia"));
        }
        sb.append(border);
        return sb.toString();
    }

    public String getAllLogs() {
        return logger.getLogs();
    }

    public List<Member> getMembers() { return members; }
    public List<LibraryItem> getItems() { return items; }
}