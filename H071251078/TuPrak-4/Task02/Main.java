package Task02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Produk> stok = new ArrayList<>();

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            tampilkanMenu();
            System.out.print(">>> Pilih menu (1-4):  ");
            int pilih = inp.nextInt();
            inp.nextLine();

            switch (pilih) {
                case 1:
                    tambahProduk(inp);
                    break;
                    
                case 2:
                    tampilkanSemuaProduk();
                    break;

                case 3:
                    beliProduk(inp);
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    inp.close();
                    return;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void tampilkanMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");
    }

    static void tambahProduk(Scanner inp) {
        System.out.print("Masukkan nama produk: ");
        String brand = inp.nextLine();

        System.out.print("Masukkan nomor seri: ");
        int seri = inp.nextInt();

        System.out.print("Masukkan harga: ");
        double harga = inp.nextDouble();
        inp.nextLine();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int tipe = inp.nextInt();
        inp.nextLine();

        switch (tipe) {
            case 1: {
                System.out.print("Masukkan ukuran layar (inci): ");
                double increen = inp.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int storage = inp.nextInt();
                inp.nextLine();
                stok.add(new Smartphone(brand, seri, harga, increen, storage));
                break;
            }

            case 2: {
                System.out.print("Masukkan ukuran RAM (GB): ");
                int ram = inp.nextInt();
                inp.nextLine();
                System.out.print("Masukkan tipe prosesor: ");
                String procie = inp.nextLine();
                stok.add(new Laptop(brand, seri, harga, ram, procie));
                break;
            }

            case 3: {
                System.out.print("Masukkan resolusi (MP): ");
                int res = inp.nextInt();
                inp.nextLine();
                System.out.print("Masukkan tipe lensa: ");
                String lens = inp.nextLine();
                stok.add(new Camera(brand, seri, harga, res, lens));
                break;
            }

            default:
                System.out.println("Tipe tidak valid!");
        }
    }

    static void tampilkanSemuaProduk() {
        System.out.println("Daftar Produk:");
        for (Produk p : stok) {
            p.displayInfo();
            System.out.println();
        }
    }

    static void beliProduk(Scanner inp) {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int seri = inp.nextInt();
        inp.nextLine();

        boolean ditemukan = false;
        for (Produk p : stok) {
            if (p.seriesNumber == seri) {
                System.out.println("Anda telah membeli produk:");
                p.displayInfo();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }
}