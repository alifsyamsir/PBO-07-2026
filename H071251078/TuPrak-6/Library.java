import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    private List<LibraryItem> items;
    private List<Member> members;
    private LibraryLogger logger;

    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
        this.logger = new LibraryLogger();
    }

    public String addItem(LibraryItem item) {
        items.add(item);
        return item.getTitle() + " berhasil ditambahkan";
    }

    public LibraryItem findItemById(int itemId) {
        for (LibraryItem it : items) {
            if (it.getItemId() == itemId) {
                return it;
            }
        }
        throw new NoSuchElementException("Item dengan ID " + itemId + " tidak ditemukan");
    }

    public String getLibraryStatus() {
        if (items.isEmpty()) {
            return "Belum ada item di perpustakaan";
        }

        StringBuilder stbu = new StringBuilder();
        stbu.append("+-----+--------------------------------+------------+\n");
        stbu.append("| ID  | Judul                          | Status     |\n");
        stbu.append("+-----+--------------------------------+------------+\n");
        for (LibraryItem item : items) {
            String stat;
            if (item.isBorrowed()) {
                stat = "Dipinjam";
            } else {
                stat = "Tersedia";
            }
            stbu.append(String.format("| %-3d | %-30s | %-10s |%n",
                    item.getItemId(), item.getTitle(), stat));
        }
        stbu.append("+-----+--------------------------------+------------+");
        return stbu.toString();
    }

    public String getAllLogs() {
        return logger.getLogs();
    }

    public String addMember(Member m) {
        members.add(m);
        return "Anggota " + m.getName() + " berhasil ditambahkan";
    }

    public Member findMemberById(int memberId) {
        for (Member m : members) {
            if (m.getMemberId() == memberId) {
                return m;
            }
        }
        throw new NoSuchElementException("Anggota dengan ID " + memberId + " tidak ditemukan");
    }

    public String pinjamItem(int memberId, int itemId, int days) {
        Member m = findMemberById(memberId);
        LibraryItem it = findItemById(itemId);
        String hasil = m.borrow(it, days);

        String jenis;
        if (it instanceof Book) {
            jenis = "Buku";
        } else {
            jenis = "DVD";
        }
        logger.logActivity(jenis + " '" + it.getTitle() + "' dipinjam oleh " + m.getName());
        return hasil;
    }

    public String kembalikanItem(int memberId, int itemId, int daysLate) {
        Member m = findMemberById(memberId);
        LibraryItem it = findItemById(itemId);
        String hasil = m.returnItem(it, daysLate);

        String jenis;
        if (it instanceof Book) {
            jenis = "Buku";
        } else {
            jenis = "DVD";
        }
        logger.logActivity(jenis + " '" + it.getTitle() + "' dikembalikan oleh " + m.getName());
        return hasil;
    }

    public List<LibraryItem> getItems() {
        return items;
    }

    public List<Member> getMembers() {
        return members;
    }

    public LibraryLogger getLogger() {
        return logger;
    }
}