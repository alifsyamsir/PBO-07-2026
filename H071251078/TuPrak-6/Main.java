import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner inp = new Scanner(System.in);
    private static Library library = new Library();

    public static void main(String[] args) {
        boolean jalan = true;
        while (jalan) {
            tampilkanMenu();
            int pilihan = bacaInt();
            switch (pilihan) {
                case 1:
                    tambahItem();
                    break;
                case 2:
                    tambahAnggota();
                    break;
                case 3:
                    pinjamItem();
                    break;
                case 4:
                    kembalikanItem();
                    break;
                case 5:
                    System.out.println();
                    System.out.println(library.getLibraryStatus());
                    break;
                case 6:
                    System.out.println();
                    System.out.println("--- Log Aktivitas ---");
                    System.out.println(library.getAllLogs());
                    break;
                case 7:
                    lihatItemAnggota();
                    break;
                case 8:
                    System.out.println("Terima kasih, sampai jumpa!");
                    jalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
        inp.close();
    }

    static void tampilkanMenu() {
        System.out.println();
        System.out.println("=== Sistem Manajemen Perpustakaan ===");
        System.out.println("1. Tambah Item");
        System.out.println("2. Tambah Anggota");
        System.out.println("3. Pinjam Item");
        System.out.println("4. Kembalikan Item");
        System.out.println("5. Lihat Status Perpustakaan");
        System.out.println("6. Lihat Log Aktivitas");
        System.out.println("7. Lihat Item yang Dipinjam Anggota");
        System.out.println("8. Keluar");
        System.out.print("Pilih: ");
    }

    static int bacaInt() {
        try {
            int n = inp.nextInt();
            inp.nextLine();
            return n;
        } catch (InputMismatchException e) {
            inp.nextLine();
            return -1;
        }
    }

    static void tambahItem() {
        System.out.println();
        System.out.println("Pilih jenis item:");
        System.out.println("1. Buku");
        System.out.println("2. DVD");
        System.out.print("Pilih: ");
        int jenis = bacaInt();

        if (jenis != 1 && jenis != 2) {
            System.out.println("Jenis tidak valid");
            return;
        }

        System.out.print("Masukkan ID item: ");
        int id = bacaInt();
        if (id < 0) {
            System.out.println("ID tidak valid");
            return;
        }

        System.out.print("Masukkan judul: ");
        String judul = inp.nextLine();

        try {
            if (jenis == 1) {
                System.out.print("Masukkan nama author: ");
                String author = inp.nextLine();
                Book b = new Book(judul, id, author);
                System.out.println(library.addItem(b));
            } else {
                System.out.print("Masukkan durasi (menit): ");
                int dur = bacaInt();
                DVD d = new DVD(judul, id, dur);
                System.out.println(library.addItem(d));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void tambahAnggota() {
        System.out.println();
        System.out.print("Masukkan nama anggota: ");
        String nama = inp.nextLine();
        System.out.print("Masukkan ID anggota: ");
        int id = bacaInt();
        if (id < 0) {
            System.out.println("ID tidak valid");
            return;
        }
        Member m = new Member(nama, id);
        System.out.println(library.addMember(m));
    }

    static void pinjamItem() {
        System.out.println();
        System.out.print("Masukkan ID anggota: ");
        int memberId = bacaInt();
        System.out.print("Masukkan ID item: ");
        int itemId = bacaInt();
        System.out.print("Masukkan jumlah hari peminjaman: ");
        int hari = bacaInt();

        try {
            String hasil = library.pinjamItem(memberId, itemId, hari);
            System.out.println(hasil);
        } catch (IllegalStateException e) {
            System.out.println("Gagal meminjam: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal meminjam: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void kembalikanItem() {
        System.out.println();
        System.out.print("Masukkan ID anggota: ");
        int memberId = bacaInt();
        System.out.print("Masukkan ID item: ");
        int itemId = bacaInt();
        System.out.print("Masukkan jumlah hari keterlambatan (0 jika tidak telat): ");
        int telat = bacaInt();
        if (telat < 0) {
            telat = 0;
        }

        try {
            String hasil = library.kembalikanItem(memberId, itemId, telat);
            System.out.println(hasil);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void lihatItemAnggota() {
        System.out.println();
        System.out.print("Masukkan ID anggota: ");
        int id = bacaInt();
        try {
            Member m = library.findMemberById(id);
            System.out.println("Item yang dipinjam oleh " + m.getName() + ":");
            System.out.println(m.getBorrowedItems());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}