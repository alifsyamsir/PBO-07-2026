public class PemainMU {
    String nama;
    String posisi;
    int nomorPunggung;
    String kebangsaan;
    StatistikMusim statistik;
    Kontrak kontrak;

    public PemainMU() {
        this.nama = "Unknown";
        this.posisi = "Unpositioned";
        this.nomorPunggung = 0;
        this.kebangsaan = "Unknown";
        this.statistik = new StatistikMusim();
        this.kontrak = new Kontrak();
    }

    public PemainMU(String nama, String posisi, int nomorPunggung, String kebangsaan) {
        this.nama = nama;
        this.posisi = posisi;
        this.nomorPunggung = nomorPunggung;
        this.kebangsaan = kebangsaan;
        this.statistik = new StatistikMusim();
        this.kontrak = new Kontrak();
    }

    public PemainMU(String nama, String posisi, int nomorPunggung, String kebangsaan,
                    StatistikMusim statistik, Kontrak kontrak) {
        this.nama = nama;
        this.posisi = posisi;
        this.nomorPunggung = nomorPunggung;
        this.kebangsaan = kebangsaan;
        this.statistik = statistik;
        this.kontrak = kontrak;
    }

    public void tampilkanProfil() {
        System.out.println("===================================");
        System.out.println (" MANCHESTER UNITED - PROFIL PEMAIN");
        System.out.println("===================================");
        System.out.println(" Nama          : " + nama);
        System.out.println(" Posisi        : " + posisi);
        System.out.println(" Nomor Punggung: " + nomorPunggung);
        System.out.println(" Kebangsaan    : " + kebangsaan);
        System.out.println("-----------------------------------");
        System.out.println(" STATISTIK MUSIM INI:");
        System.out.println(" " + statistik.ringkasanStatistik());
        System.out.println(" Kontribusi Gol: " + statistik.kontribusiGol());
        System.out.println("-----------------------------------");
        System.out.println(" KONTRAK:");
        System.out.println(" " + kontrak.infoKontrak());
        System.out.println("-----------------------------------");
    }

    public void bandingkanDengan(PemainMU pemainLain) {
        System.out.println("\n==================================================");
        System.out.println(" PERBANDINGAN STATISTIK");
        System.out.println("==================================================");
        System.out.printf("%-20s %-15s %-15s%n", " Kategori", this.nama, pemainLain.nama);
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-15d %-15d%n", " Gol", this.statistik.gol, pemainLain.statistik.gol);
        System.out.printf("%-20s %-15d %-15d%n", " Assist", this.statistik.assist, pemainLain.statistik.assist);
        System.out.printf("%-20s %-15d %-15d%n", " Penampilan", this.statistik.penampilanTotal, pemainLain.statistik.penampilanTotal);
        System.out.printf("%-20s %-15.1f %-15.1f%n", " Rating", this.statistik.ratingAverage, pemainLain.statistik.ratingAverage);
        System.out.printf("%-20s %-15d %-15d%n", " Kontribusi Gol", this.statistik.kontribusiGol(), pemainLain.statistik.kontribusiGol());
        System.out.println("==================================================");

        String pemainTerbaik;
        if (this.statistik.ratingAverage > pemainLain.statistik.ratingAverage) {
            pemainTerbaik = this.nama;
        } else if (this.statistik.ratingAverage < pemainLain.statistik.ratingAverage) {
            pemainTerbaik = pemainLain.nama;
        } else {
            pemainTerbaik = this.statistik.kontribusiGol() >= pemainLain.statistik.kontribusiGol()
                    ? this.nama : pemainLain.nama;
        }
        System.out.println(" Pemain Terbaik Musim Ini: " + pemainTerbaik);
    }

    public void evaluasiKontrak() {
        System.out.println("\n======================================");
        System.out.println(" EVALUASI KONTRAK - " + nama);
        System.out.println("======================================");
        System.out.println("======================================");

        if (!kontrak.isKontrakAktif()) {
            System.out.println(" Kontrak tidak aktif. Pemain bebas transfer!");
            return;
        }

        boolean performaBagus = statistik.ratingAverage >= 7.0 && statistik.kontribusiGol() >= 10;

        if (performaBagus && kontrak.sisaMusim <= 1) {
            System.out.println(" Rekomendasi: PERPANJANG KONTRAK");
            System.out.println("   Alasan: Performa bagus, kontrak hampir habis.");
        } else if (!performaBagus) {
            System.out.println(" Rekomendasi: TIDAK DIPERPANJANG");
            System.out.println("   Alasan: Performa di bawah ekspektasi.");
        } else {
            System.out.println(" Rekomendasi: PANTAU TERUS");
            System.out.println("   Alasan: Kontrak masih aman, performa cukup baik.");
        }
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getPosisi() { return posisi; }
    public void setPosisi(String posisi) { this.posisi = posisi; }
}
