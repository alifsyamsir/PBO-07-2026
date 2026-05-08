import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int memberId;
    private List<LibraryItem> borrowedItems;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
    }

    public String borrow(LibraryItem item, int days) {
        if (item.isBorrowed()) {
            throw new IllegalStateException("Item " + item.getTitle() + " sedang tidak tersedia (sudah dipinjam)");
        }
        String hasil = item.borrowItem(days);
        item.setBorrowed(true);
        borrowedItems.add(item);
        return hasil;
    }

    public String returnItem(LibraryItem item, int daysLate) {
        item.returnItem();
        borrowedItems.remove(item);
        double denda = item.calculateFine(daysLate);
        return "Item " + item.getTitle() + " berhasil dikembalikan dengan denda: Rp " + denda;
    }

    public String getBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            return "Tidak ada item yang dipinjam";
        }

        StringBuilder stbu = new StringBuilder();
        stbu.append("+-----+--------------------------------+\n");
        stbu.append("| ID  | Judul                          |\n");
        stbu.append("+-----+--------------------------------+\n");
        for (LibraryItem item : borrowedItems) {
            stbu.append(String.format("| %-3d | %-30s |%n", item.getItemId(), item.getTitle()));
        }
        stbu.append("+-----+--------------------------------+");
        return stbu.toString();
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public List<LibraryItem> getBorrowedList() {
        return borrowedItems;
    }
}