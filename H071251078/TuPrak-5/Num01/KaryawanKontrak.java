package Num01;

class KaryawanKontrak extends Karyawan {
    private double upahPerHari;

    public KaryawanKontrak(String nama, String idKaryawan, double upahPerHari) {
        super(nama, idKaryawan);
        this.upahPerHari = upahPerHari;
    }

    public double hitungGaji() {
        double totalGaji = upahPerHari * jumlahKehadiran();
        if (jumlahKehadiran() > 20) {
            totalGaji += 500000;
        }
        return totalGaji;
    }
}