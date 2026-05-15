package soal1;

class KaryawanKontrak extends Karyawan {
    private double upahPerHari;

    public KaryawanKontrak(String nama, String idKaryawan, double upahPerHari) {
        super(nama, idKaryawan);
        this.upahPerHari = upahPerHari;
    }

    @Override
    public double hitungGaji() {
        double total = upahPerHari * getJumlahKehadiran();

        if (getJumlahKehadiran() > 20) {
            total += 500000;
        }

        return total;
    }

    public void tampilData() {
        System.out.println("\n=== Karyawan Kontrak ===");
        System.out.println("Nama               : " + getNama());
        System.out.println("ID Karyawan        : " + getIdKaryawan());
        System.out.println("Jumlah Kehadiran   : " + getJumlahKehadiran());
        System.out.println("Total Gaji         : " + hitungGaji());
    }
}