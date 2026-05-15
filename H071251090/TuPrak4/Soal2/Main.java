package TuPrak4.Soal2;

import java.util.Scanner;

public class Main {
    static Product[] stok = new Product[100];
    static int jumlahProduk = 0;

    static void tampilkanMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");
    }

    static void tambahProduk(Scanner scanner) {
        System.out.print("Masukkan nama produk: ");
        String brand = scanner.nextLine();
        System.out.print("Masukkan nomor seri: ");
        int seriesNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan harga: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int tipe = Integer.parseInt(scanner.nextLine());

        if (tipe == 1) {
            Smartphone s = new Smartphone();
            s.brand = brand;
            s.seriesNumber = seriesNumber;
            s.price = price;
            System.out.print("Masukkan ukuran layar (inci): ");
            s.screenSize = Double.parseDouble(scanner.nextLine());
            System.out.print("Masukkan kapasitas penyimpanan (GB): ");
            s.storageCapacity = Integer.parseInt(scanner.nextLine());
            stok[jumlahProduk] = s;
            jumlahProduk++;

        } else if (tipe == 2) {
            Laptop l = new Laptop();
            l.brand = brand;
            l.seriesNumber = seriesNumber;
            l.price = price;
            System.out.print("Masukkan tipe prosesor: ");
            l.processorType = scanner.nextLine();
            System.out.print("Masukkan ukuran RAM (GB): ");
            l.ramSize = Integer.parseInt(scanner.nextLine());
            stok[jumlahProduk] = l;
            jumlahProduk++;

        } else if (tipe == 3) {
            Camera c = new Camera();
            c.brand = brand;
            c.seriesNumber = seriesNumber;
            c.price = price;
            System.out.print("Masukkan resolusi (MP): ");
            c.resolution = Integer.parseInt(scanner.nextLine());
            System.out.print("Masukkan tipe lensa: ");
            c.lensType = scanner.nextLine();
            stok[jumlahProduk] = c;
            jumlahProduk++;

        } else {
            System.out.println("Tipe produk tidak valid!");
        }
    }

    static void tampilkanSemuaProduk() {
        System.out.println("Daftar Produk:");
        for (int i = 0; i < jumlahProduk; i++) {
            stok[i].displayInfo();
            System.out.println();
        }
    }

    static void beliProduk(Scanner scanner) {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int cariSeri = Integer.parseInt(scanner.nextLine());

        boolean ditemukan = false;
        for (int i = 0; i < jumlahProduk; i++) {
            if (stok[i].seriesNumber == cariSeri) {
                System.out.println("Anda telah membeli produk:");
                stok[i].displayInfo();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan = 0;
        while (pilihan != 4) {
            tampilkanMenu();
            System.out.print(">>> Pilih menu (1-4):  ");
            pilihan = Integer.parseInt(scanner.nextLine());

            if (pilihan == 1) {
                tambahProduk(scanner);
            } else if (pilihan == 2) {
                tampilkanSemuaProduk();
            } else if (pilihan == 3) {
                beliProduk(scanner);
            } else if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}