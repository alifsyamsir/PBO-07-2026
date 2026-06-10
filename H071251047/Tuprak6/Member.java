import java.util.ArrayList;
import java.util.List;

class Member {
    
    String nama;
    int memberId;
    List <LibraryItem> borrowedItems;
    
    public Member(String nama, int memberId) {
        this.nama = nama;
        this.memberId = memberId;
        borrowedItems = new ArrayList<>();
    }
    
    public String borrow(LibraryItem item, int days) {
        if (item.isBorrowed){
            throw new IllegalStateException("Item sedang tidak tersedia");
        }
        
        String result = item.borrowItem(days);
        borrowedItems.add(item);
        return result;
    }

    public String returnItem(LibraryItem item, int daysLate) {
        item.returnItem();
        borrowedItems.remove(item);

        double fine = item.calculateFine(daysLate);
        return "Item " + item.title + " berhasil dikembalikan dengan denda: Rp " + fine;

    }

    public void getBorrowedItems() {

        if (borrowedItems.isEmpty()) {
            System.out.println("Tidak ada item yang dipinjam");
            return;
        }

        System.out.println("Daftar item yang dipinjam:");
        System.out.println("╔══════╗════════════════════════════════╗");
        System.out.println("║ ID   ║             JUDUL              ║");
        System.out.println("╠══════╣════════════════════════════════╣");
        for (LibraryItem item : borrowedItems) {
            System.out.printf("║ %-4d ║ %-30s ║\n", item.itemId, item.title);
        }
        System.out.println("╚══════╩════════════════════════════════╝");
    }
    }
// import java.util.ArrayList;
// import java.util.List;

// class Member {

//     String name;
//     String memberId;
//     List<LibraryItem> borrowedItems;

//     public Member(String name, String memberId) {
//         this.name = name;
//         this.memberId = memberId;
//         borrowedItems = new ArrayList<>();
//     }

//     // meminjam item
//     public String borrow(LibraryItem item, int days) {

//         // cek apakah item sudah dipinjam
//         if (item.isBorrowed) {
//             throw new IllegalStateException("Item sedang tidak tersedia");
//         }

//         // panggil method borrowItem() dari object item
//         String result = item.borrowItem(days);

//         // tambahkan ke daftar pinjaman member
//         borrowedItems.add(item);

//         return result;
//     }

//     // mengembalikan item
//     public String returnItem(LibraryItem item, int daysLate) {

//         // panggil method returnItem() dari item
//         item.returnItem();

//         // hapus dari daftar pinjaman
//         borrowedItems.remove(item);

//         // hitung denda
//         double fine = item.calculateFine(daysLate);

//         return "Item " + item.title +
//                 " berhasil dikembalikan dengan denda: Rp " + fine;
//     }

//     // menampilkan daftar item yang dipinjam
//     
//     }
// }