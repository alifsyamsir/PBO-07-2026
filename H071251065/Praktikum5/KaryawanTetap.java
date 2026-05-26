package Praktikum5;

public class KaryawanTetap extends Karyawan{
    double gajiPokok;
    double tunjanganMakan;

    KaryawanTetap(String nama, String idKaryawan, double gajiPokok, double tunjanganMakan) {
    super(nama, idKaryawan);
    this.gajiPokok = gajiPokok;
    this.tunjanganMakan= tunjanganMakan;
    }
    @Override
    double hitungGaji() {
    double totalGaji =gajiPokok + (tunjanganMakan * getJumlahKehadiran());
        return totalGaji;
    }

    double hitungGaji(double bonusKinerja) {
        return hitungGaji() + bonusKinerja;
    }

}
