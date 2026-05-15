package soal1;

class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private double tunjanganMakan;

    public KaryawanTetap(String nama, String idKaryawan, double gajiPokok, double tunjanganMakan) {
        super(nama, idKaryawan);
        this.gajiPokok = gajiPokok;
        this.tunjanganMakan = tunjanganMakan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (tunjanganMakan * getJumlahKehadiran());
    }

    public double hitungGaji(double bonusKinerja) {
        return hitungGaji() + bonusKinerja;
    }

    public void tampilData(double bonus) {
        System.out.println("=== Karyawan Tetap ===");
        System.out.println("Nama               : " + getNama());
        System.out.println("ID Karyawan        : " + getIdKaryawan());
        System.out.println("Jumlah Kehadiran   : " + getJumlahKehadiran());
        System.out.println("Total Gaji         : " + hitungGaji(bonus));
    }
}