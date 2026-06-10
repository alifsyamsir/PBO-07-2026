public class Perpustakaan {
    String nama;
    int jumlahBuku;
    Buku buku;

    Perpustakaan() {
        nama = "Perpus Umum";
        jumlahBuku = 1;
        buku = new Buku("Tidak ada", false);
    }

    Perpustakaan(String nama, int jumlahBuku, Buku buku) {
        this.nama = nama;
        this.jumlahBuku = jumlahBuku;
        this.buku = buku;
    }

    void pinjamBuku() {
        if (jumlahBuku > 0 && !buku.dipinjam) {
            buku.pinjam();
            jumlahBuku--;
            System.out.println("Buku " + buku.judul + " dipinjam dari " + nama);
        } else {
            System.out.println("Buku tidak tersedia!");
        }
    }

    void tukarBuku(Perpustakaan perpusLain) {
        System.out.println(nama + " menukar buku dengan " + perpusLain.nama);

        Buku abu = this.buku;
        this.buku = perpusLain.buku;
        perpusLain.buku = abu;
    }

    void tampilkanInfo() {
        System.out.println("Nama Perpustakaan\t: " + nama);
        System.out.println("Jumlah Buku\t\t: " + jumlahBuku);
        System.out.println("Judul Buku\t\t: " + buku.judul);
        System.out.println("Status\t\t\t: " + (buku.dipinjam ? "Dipinjam" : "Tersedia"));
        System.out.println("========================================");
    }
}