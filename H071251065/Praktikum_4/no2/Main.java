package Praktikum_4.no2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //menyimpan semua produk dlm array
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Smartphone("Samsung", 123456, 899.99, 6.5, 256));
        products.add(new Laptop("Dell", 987654, 1299.99, 16, "Intel Core i7"));
        products.add(new Camera("Canon", 456789, 699.99, 24, "Telephoto"));

        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");

            System.out.print("\n>>> Pilih menu (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tambahProduk(input, products);
                    break;
                case 2:
                    tampilkanSemuaProduk(products);
                    break;
                case 3:
                    beliProduk(input, products);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid.");
            }

        } while (pilihan != 4);

        input.close();
    }

    //method menambahkan produk
    static void tambahProduk(Scanner input, ArrayList<Product> products) {
        input.nextLine(); 

        System.out.print("Masukkan nama produk: ");
        String brand = input.nextLine();

        System.out.print("Masukkan nomor seri: ");
        int seriesNumber = input.nextInt();

        System.out.print("Masukkan harga: ");
        double price = input.nextDouble();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");

        System.out.print("Pilih tipe produk (1-3): ");
        int tipe = input.nextInt();

        switch (tipe) {
            case 1:
                System.out.print("Masukkan ukuran layar (inci): ");
                double screenSize = input.nextDouble();

                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int storage = input.nextInt();

                products.add(new Smartphone(brand, seriesNumber,price, screenSize,storage));
                break;

            case 2:
                System.out.print("Masukkan RAM Size (GB): ");
                int ram = input.nextInt();

                input.nextLine();

                System.out.print("Masukkan Processor Type: ");
                String processor = input.nextLine();

                products.add(new Laptop( brand, seriesNumber, price, ram,processor));
                break;

            case 3:
                System.out.print("Masukkan Resolution (MP): ");
                int resolution = input.nextInt();

                input.nextLine();

                System.out.print("Masukkan Lens Type: ");
                String lens = input.nextLine();

                products.add(new Camera( brand, seriesNumber, price, resolution, lens));
                break;

            default:
                System.out.println("Tipe produk tidak valid.");
        }
    }

   //method menampilkan produk
    static void tampilkanSemuaProduk(ArrayList<Product> products) {

        System.out.println("\nDaftar Produk:");

        for (int i = 0; i < products.size(); i++){
            products.get(i).displayInfo();
            System.out.println();
        }
    }
   
    static void beliProduk(Scanner input, ArrayList<Product> products) {

        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int cariSerial = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).seriesNumber == cariSerial) {
            System.out.println("Anda telah membeli produk:");
            products.get(i).displayInfo();

                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
    }
    }
}
