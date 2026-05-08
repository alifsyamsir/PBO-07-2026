package TuPrak6;

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
            throw new IllegalStateException("Item " + item.getTitle() + " tidak tersedia (sudah dipinjam).");
        }
        String result = item.borrowItem(days);
        borrowedItems.add(item);
        return result;
    }

    public String returnItem(LibraryItem item, int daysLate) {
        item.returnItem();
        borrowedItems.remove(item);
        double fine = item.calculateFine(daysLate);
        return String.format("Item %s berhasil dikembalikan dengan denda: Rp %,.0f", item.getTitle(), fine);
    }

    public void getBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("Tidak ada item yang dipinjam");
            return;
        }
        int idWidth = 6, titleWidth = 20;
        String border = "+" + "-".repeat(idWidth) + "+" + "-".repeat(titleWidth) + "+";
        System.out.println(border);
        System.out.printf("| %-" + (idWidth - 2) + "s | %-" + (titleWidth - 2) + "s |%n", "ID", "Judul");
        System.out.println(border);
        for (LibraryItem item : borrowedItems) {
            System.out.printf("| %-" + (idWidth - 2) + "d | %-" + (titleWidth - 2) + "s |%n",
                    item.getItemId(), item.getTitle());
        }
        System.out.println(border);
    }

    public String getName() { return name; }
    public int getMemberId() { return memberId; }
    public List<LibraryItem> getBorrowedItemsList() { return borrowedItems; }
}