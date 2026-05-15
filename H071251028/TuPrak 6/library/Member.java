package library;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private List<LibraryItem> borrowed = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public String borrow(LibraryItem item, int days) {
        String msg = item.borrowItem(days);
        borrowed.add(item);
        return msg;
    }

    public String returnItem(LibraryItem item) {
        borrowed.remove(item);
        item.returnItem();
        return "Item " + item.getTitle() + " berhasil dikembalikan.";
    }

    public void showBorrowedItems() {
        if (borrowed.isEmpty()) {
            System.out.println("Tidak ada item yang dipinjam.");
            return;
        }

        for (LibraryItem item : borrowed) {
            System.out.println("- " + item.getDescription());
        }
    }

    public String getName() {
        return name;
    }
}