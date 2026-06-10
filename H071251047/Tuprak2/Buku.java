class Buku {
    String judul;
    boolean dipinjam;

    Buku(String judul, boolean dipinjam) {
        this.judul = judul;
        this.dipinjam = dipinjam;
    }

    void pinjam() {
        dipinjam = true;
    }

    void kembali() {
        dipinjam = false;
    }
}