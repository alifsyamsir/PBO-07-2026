import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    // Inisialisasi library dan scanner sebagai variabel statis agar bisa diakses semua method
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);
    // Menyiapkan satu logger utama di dalam library (sesuai struktur source 3)
    private static LibraryLogger mainLogger = new LibraryLogger();

    public static void main(String[] args) {
        // Menambahkan logger ke dalam list libraryLoggers di class Library
        library.libraryLoggers.add(mainLogger);

        boolean running = true;
        while (running) {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║         SISTEM PERPUSTAKAAN        ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1. TAMBAH ITEM                     ║");
        System.out.println("║ 2. TAMBAH MEMBER                   ║");
        System.out.println("║ 3. PINJAM BUKU                     ║");
        System.out.println("║ 4. KEMBALIKAN BUKU                 ║");
        System.out.println("║ 5. STATUS PERPUSTAKAAN             ║");
        System.out.println("║ 6. LOG AKTIVITAS                   ║");
        System.out.println("║ 7. LIHAT ITEM PINJAMAN MEMBER      ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 8. KELUAR                          ║");
        System.out.println("╚════════════════════════════════════╝");
            System.out.print("Pilih menu: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1: tambahItem(); break;
                    case 2: tambahAnggota(); break;
                    case 3: pinjamItem(); break;
                    case 4: kembalikanItem(); break;
                    case 5: library.getLibraryStatus(); break;
                    case 6: library.getAllLogs(); break;
                    case 7: lihatPinjamanAnggota(); break;
                    case 8: 
                        running = false;
                        System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }

    private static void tambahItem() {
        System.out.println("\n--- Tambah Item ---");
        System.out.print("Tipe Item (1. Buku / 2. DVD): ");
        int tipe = Integer.parseInt(scanner.nextLine());

        if (tipe != 1 && tipe != 2) {
            System.out.println("Tipe tidak valid!");
            return;
        }

        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("ID Item: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (tipe == 1) {
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.println(library.addItem(new Book(penulis, judul, id, false)));
        } else {
            System.out.print("Durasi (menit): ");
            int durasi = Integer.parseInt(scanner.nextLine());
            System.out.println(library.addItem(new DVD(durasi, judul, id, false)));
        }
    }

    private static void tambahAnggota() {
        System.out.println("\n--- Tambah Anggota ---");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("ID Anggota: ");
        int id = Integer.parseInt(scanner.nextLine());

        Member memberNew = new Member(nama, id);
        library.members.add(memberNew);
        System.out.println("Anggota " + nama + " berhasil ditambahkan.");
    }

    private static void pinjamItem() {
        System.out.println("\n--- Pinjam Item ---");
        System.out.print("ID Anggota: ");
        int memberId = Integer.parseInt(scanner.nextLine());
        System.out.print("ID Item: ");
        int itemId = Integer.parseInt(scanner.nextLine());
        System.out.print("Lama Pinjam (hari): ");
        int hari = Integer.parseInt(scanner.nextLine());

        Member m = findMember(memberId);
        if (m == null) return;

        try {
            LibraryItem item = library.findItemById(itemId);
            if (item != null) {
                String result = m.borrow(item, hari);
                System.out.println(result);
                // Mencatat aktivitas ke logger
                String logMsg = String.format("[%s] dipinjam oleh %s", item.title, m.nama);
                mainLogger.logActivity(logMsg);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Item dengan ID tersebut tidak ditemukan.");
        } catch (Exception e) {
            System.out.println("Gagal meminjam: " + e.getMessage());
        }
    }

    private static void kembalikanItem() {
        System.out.println("\n--- Kembalikan Item ---");
        System.out.print("ID Anggota: ");
        int memberId = Integer.parseInt(scanner.nextLine());
        System.out.print("ID Item: ");
        int itemId = Integer.parseInt(scanner.nextLine());
        System.out.print("Keterlambatan (hari): ");
        int telat = Integer.parseInt(scanner.nextLine());

        Member m = findMember(memberId);
        if (m == null) return;

        try {
            LibraryItem item = library.findItemById(itemId);
            if (item != null) {
                String result = m.returnItem(item, telat);
                System.out.println(result);
                // Mencatat aktivitas ke logger
                String logMsg = String.format("[%s] dikembalikan oleh %s", item.title, m.nama);
                mainLogger.logActivity(logMsg);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Item tidak ditemukan.");
        }
    }

    private static void lihatPinjamanAnggota() {
        System.out.print("Masukkan ID Anggota: ");
        int id = Integer.parseInt(scanner.nextLine());
        Member m = findMember(id);
        if (m != null) {
            m.getBorrowedItems();
        }
    }

    // Fungsi pembantu untuk mencari member berdasarkan ID String
    private static Member findMember(int id) {
        for (Member m : library.members) {
            if (m.memberId == id) return m;
        }
        System.out.println("Anggota tidak ditemukan.");
        return null;
    }
}