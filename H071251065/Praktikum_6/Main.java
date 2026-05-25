import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Item");
            System.out.println("4. Kembalikan Item");
            System.out.println("5. Lihat Status Perpustakaan");
            System.out.println("6. Lihat Log Aktivitas");
            System.out.println("7. Lihat Item Dipinjam Anggota");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan;

            try {
                pilihan = input.nextInt();
                input.nextLine();
             } catch (Exception e) {
                System.out.println("Error: Masukkan angka yang valid");
                input.nextLine();
                continue;
            }
            try{
                switch (pilihan) {
                    case 1: 
                        System.out.print("Jenis: \n[1]Book \n[2]DVD \n: ");
                        int jenis = input.nextInt();
                        input.nextLine();

                        System.out.print("Judul: ");
                        String title = input.nextLine();
                        // input.nextLine();

                        int id;

                        try {
                            System.out.print("ID: ");
                            id = input.nextInt();
                            input.nextLine();

                        } catch (Exception e) {
                            System.out.println("ID harus berupa angka");
                            input.nextLine();
                            break;
                        };

                        if (jenis == 1) {
                            System.out.print("Author: ");
                            String author = input.nextLine();
                            Book book = new Book(title, id, false, author);

                            System.out.println(library.addItem(book));

                        } else if (jenis == 2) {
                            System.out.print("Durasi (menit): ");
                            int duration = input.nextInt();
                            DVD dvd = new DVD(title, id, false, duration);
                            
                            System.out.println (library.addItem(dvd));
                            
                        } else {
                            System.out.println("Jenis item tidak valid");
                        }
                        break;

                    case 2: 
                        System.out.print("Nama: ");
                        String name = input.nextLine();

                        System.out.print("Member ID: ");
                        String memberId = input.nextLine();
                        
                        Member member = new Member(name, memberId);
                        library.members.add(member);
                        System.out.println("Member " + name + " berhasil ditambahkan");
                        break;

                    case 3: 
                        System.out.print("ID Member: ");
                        String mId = input.nextLine();

                        System.out.print("ID Item: ");
                        int itemId = input.nextInt();
                        input.nextLine();

                        System.out.print("Lama hari peminjaman: ");
                        int days = input.nextInt();
                        input.nextLine();

                        member = null;

                        for (Member m : library.members) {
                            if (m.memberId.equals(mId)) {
                                member = m;
                                break;
                            }
                        }
                        if (member == null) {
                            System.out.println("Member tidak ditemukan");
                            break;
                        }

                        LibraryItem item = library.findItemById(itemId);

                        String result = member.borrow(item, days);

                        library.logger.logActivity(
                                item.title + " dipinjam oleh " + member.name
                        );

                        System.out.println(result);

                        break;

                    case 4: 
                        System.out.print("ID Member: ");
                        mId = input.nextLine();

                        System.out.print("ID Item: ");
                        itemId = input.nextInt();

                        System.out.print("Hari terlambat: ");
                        int late = input.nextInt();
                        input.nextLine();

                        member = null;
                        for (Member m : library.members) {
                            if (m.memberId.equals(mId)) {
                                member = m;
                                break;
                            }
                        }
                        if (member == null) {
                        System.out.println("Member tidak ditemukan");
                        break;
}
                        item = library.findItemById(itemId);

                        result = member.returnItem(item, late);
                        library.logger.logActivity(item.title + " dikembalikan oleh " + member.name);

                        System.out.println(result);
                        break;
                    case 5:
                        System.out.println(library.getLibraryStatus());
                        break;

                    case 6:
                        System.out.println(library.getAllLogs());
                        break;

                    case 7:
                        System.out.print("ID Member: ");
                        mId = input.nextLine();

                        boolean found = false;

                        for (int i = 0; i < library.members.size(); i++) {

                            Member m = library.members.get(i);
                            if (m.memberId.equals(mId)) {
                                m.getBorrowedItems();
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Member tidak ditemukan");
                        }
                        break;
                    case 8:
                        System.out.println("Keluar...");
                        return;

                    default:
                        System.out.println("Pilihan tidak valid");
                } 
            }catch (IllegalArgumentException | IllegalStateException | NoSuchElementException e) {
                System.out.println("Error: " + e.getMessage());
            }catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } 
    }
    // input.close();
}