package TuPrak6;

import java.util.Scanner;

public class Main {
    static Library library = new Library();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Item");
            System.out.println("4. Kembalikan Item");
            System.out.println("5. Lihat Status Perpustakaan");
            System.out.println("6. Lihat Log Aktivitas");
            System.out.println("7. Lihat Item yang Dipinjam Anggota");
            System.out.println("8. Keluar");
            System.out.print("Pilihan: ");

            String input = sc.nextLine().trim();
            switch (input) {
                case "1": tambahItem(); break;
                case "2": tambahAnggota(); break;
                case "3": pinjamItem(); break;
                case "4": kembalikanItem(); break;
                case "5": System.out.println(library.getLibraryStatus()); break;
                case "6": System.out.println(library.getAllLogs()); break;
                case "7": lihatItemDipinjam(); break;
                case "8":
                    System.out.println("Sampai jumpa!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void tambahItem() {
        System.out.println("Jenis item: 1. Buku  2. DVD");
        System.out.print("Pilih: ");
        String jenis = sc.nextLine().trim();

        System.out.print("Judul: ");
        String title = sc.nextLine();
        System.out.print("ID Item: ");
        int id = Integer.parseInt(sc.nextLine().trim());

        try {
            if (jenis.equals("1")) {
                System.out.print("Penulis: ");
                String author = sc.nextLine();
                System.out.println(library.addItem(new Book(title, id, author)));
            } else if (jenis.equals("2")) {
                System.out.print("Durasi (menit): ");
                int duration = Integer.parseInt(sc.nextLine().trim());
                System.out.println(library.addItem(new Dvd(title, id, duration)));
            } else {
                System.out.println("Jenis tidak valid.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void tambahAnggota() {
        System.out.print("Nama anggota: ");
        String name = sc.nextLine();
        System.out.print("ID Anggota: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        System.out.println(library.addMember(new Member(name, id)));
    }

    static void pinjamItem() {
        try {
            System.out.print("ID Anggota: ");
            int memberId = Integer.parseInt(sc.nextLine().trim());
            System.out.print("ID Item: ");
            int itemId = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Jumlah hari pinjam: ");
            int days = Integer.parseInt(sc.nextLine().trim());
            System.out.println(library.borrowItem(memberId, itemId, days));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void kembalikanItem() {
        try {
            System.out.print("ID Anggota: ");
            int memberId = Integer.parseInt(sc.nextLine().trim());
            System.out.print("ID Item: ");
            int itemId = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Keterlambatan (hari): ");
            int daysLate = Integer.parseInt(sc.nextLine().trim());
            System.out.println(library.returnItem(memberId, itemId, daysLate));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void lihatItemDipinjam() {
        try {
            System.out.print("ID Anggota: ");
            int memberId = Integer.parseInt(sc.nextLine().trim());
            Member member = library.findMemberById(memberId);
            System.out.println("Item dipinjam oleh " + member.getName() + ":");
            member.getBorrowedItems();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}