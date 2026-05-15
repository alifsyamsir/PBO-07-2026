public class Kontrak {
    String status;
    int sisaMusim;
    double gajiPerMinggu;

    public Kontrak() {
        this.status = "Tidak Dikontrak";
        this.sisaMusim = 0;
        this.gajiPerMinggu = 0;
    }

    public Kontrak(String status, int sisaMusim, double gajiPerMinggu) {
        this.status = status;
        this.sisaMusim = sisaMusim;
        this.gajiPerMinggu = gajiPerMinggu;
    }

    public String infoKontrak() {
        return "Status: " + status + " | Sisa Musim: " + sisaMusim + " | Gaji: £" + gajiPerMinggu + "jt/minggu";
    }

    public boolean isKontrakAktif() {
        return status.equalsIgnoreCase("Aktif") && sisaMusim > 0;
    }
}