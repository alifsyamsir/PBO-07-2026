import java.util.*;

public class MainToko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ArrayList<Object> listStok = new ArrayList<>(); // Menggunakan ArrayList untuk menyimpan berbagai jenis produk
        int pilihMenu = 0; // Variabel untuk menyimpan pilihan menu pengguna

        do {
            System.out.println("\nMenu:\n1. Tambah Produk\n2. Tampilkan Semua Produk\n3. Beli Produk\n4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            pilihMenu = sc.nextInt(); 
            sc.nextLine();

            if (pilihMenu == 1) {
                System.out.print("Masukkan nama produk: "); String b = sc.nextLine(); 
                System.out.print("Masukkan nomor seri: "); int s = sc.nextInt();
                System.out.print("Masukkan harga: "); double h = sc.nextDouble();
                System.out.println("Pilih tipe produk:\n1. Smartphone\n2. Laptop\n3. Camera");
                int tipe = sc.nextInt();
                
                if (tipe == 1) {
                    System.out.print("Masukkan ukuran layar: "); double scr = sc.nextDouble();
                    System.out.print("Masukkan kapasitas: "); int sto = sc.nextInt();
                    listStok.add(new Smartphone(b, s, h, scr, sto));
                } else if (tipe == 2) {
                    System.out.print("Masukkan RAM: "); int ram = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Processor: "); String pro = sc.nextLine();
                    listStok.add(new Laptop(b, s, h, ram, pro));
                } else if (tipe == 3) {
                    System.out.print("Masukkan Resolusi: "); int res = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Lensa: "); String len = sc.nextLine();
                    listStok.add(new Camera(b, s, h, res, len)); 
                }
            } else if (pilihMenu == 2) {
                System.out.println("\n--- DAFTAR PRODUK TOKO ---");
                for (Object obj : listStok) { // Program akan menampilkan informasi produk yang ada di listStok satu per satu menggunakan loop for-each. Setiap objek dalam listStok akan diperiksa tipe datanya menggunakan operator instanceof, dan kemudian informasi produk akan ditampilkan sesuai dengan tipe objek tersebut
                    if (obj instanceof Smartphone) ((Smartphone) obj).tampilkanSmartphone();
                    else if (obj instanceof Laptop) ((Laptop) obj).tampilkanLaptop(); // Menampilkan informasi produk sesuai dengan tipe objek
                    else if (obj instanceof Camera) ((Camera) obj).tampilkanCamera();
                    System.out.println("-------------------------");
                }
            } else if (pilihMenu == 3) {
                System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                int cari = sc.nextInt();
                boolean ada = false; // Variabel untuk mengecek apakah produk ditemukan
                for (int i = 0; i < listStok.size(); i++) { //Program akan mengecek isi listStok satu per satu, mulai dari urutan ke-0 sampai urutan terakhir
                    Product p = (Product) listStok.get(i); //Ambil barang yang ada di posisi ke-i
                    if (p.seriesNumber == cari) { //Apakah nomor seri barang yang baru saja diambil sama dengan nomor seri yang dicari
                        System.out.println("Anda telah membeli produk:");
                        p.displayInfo(); // Ini akan menampilkan harga dengan format Rp
                        listStok.remove(i); //Jika produk ditemukan, maka produk tersebut akan dihapus dari listStok menggunakan metode remove() dengan parameter i, yang merupakan indeks dari produk yang ditemukan
                        ada = true;
                        break;
                    }
                }
                if (!ada) System.out.println("Produk tidak ditemukan."); //Jika setelah mengecek semua produk di listStok tidak ditemukan produk dengan nomor seri yang dicari, maka akan menampilkan pesan "Produk tidak ditemukan."
            }
        } while (pilihMenu != 4); //Program akan terus menampilkan menu dan menerima input dari pengguna sampai pengguna memilih opsi 4 untuk keluar
        
        System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
        sc.close();
    }
}