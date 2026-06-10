public class Main {
    public static void main(String[] args) {

        Buku buku1 = new Buku("Java Dasar", false);
        Buku buku2 = new Buku("Struktur Data", false);

        Perpustakaan p1 = new Perpustakaan("Perpus A", 15, buku1);
        Perpustakaan p2 = new Perpustakaan("Perpus B", 8, buku2);

        p1.pinjamBuku();
        p2.pinjamBuku();

        p1.tukarBuku(p2);

        p1.tampilkanInfo();
        p2.tampilkanInfo();
    }
}