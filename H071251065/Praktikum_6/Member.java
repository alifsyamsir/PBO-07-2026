import java.util.ArrayList;
import java.util.List;

public class Member {
    String name;
    String memberId;
    List<LibraryItem> borrowedItems;

    Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>(); 
    }
    String borrow(LibraryItem item, int days) {
        if (item.isBorrowed) {
            throw new IllegalStateException("Item sudah dipinjam dan tidak tersedia");
        }
        String result = item.borrowItem(days); 
        borrowedItems.add(item);               
        return result;
    }

    String returnItem(LibraryItem item, int daysLate) {
    if (!borrowedItems.contains(item)) {
        throw new IllegalArgumentException("Item ini tidak dipinjam oleh member");
    }
        double fine = item.calculateFine(daysLate);
        item.returnItem();
        borrowedItems.remove(item);
            return "Item " + item.title + " berhasil dikembalikan dengan denda: Rp " + String.format("%,.0f", fine).replace(',', '.');
}
    void getBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("Tidak ada item yang dipinjam");
            return;
        }
        System.out.println("+------+------------+");
        System.out.println("| ID   | Judul      |");
        System.out.println("+------+------------+");

        for (int i = 0; i < borrowedItems.size(); i++) {
            LibraryItem item = borrowedItems.get(i);
            System.out.printf("| %-4d | %-10s |%n", item.itemId, item.title);
        }
        System.out.println("+------+------------+");
    }
}