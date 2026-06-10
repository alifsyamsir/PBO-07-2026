package soal1;

public class KaryawanTetap extends Karyawan{
    private int gajiPokok;
    private int tunjanganMakan;

    public KaryawanTetap(String nama, String idKaryawan, int gajiPokok, int tunjanganMakan) {
        super(nama, idKaryawan);
        this.gajiPokok = gajiPokok;
        this.tunjanganMakan = tunjanganMakan;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Gaji Pokok\t\t: " + gajiPokok);
        System.out.println("Tunjangan Makan\t\t: " + tunjanganMakan);
        System.out.println("total gaji\t\t: " + hitungGaji());
    }

    @Override
    public int hitungGaji() {
        return gajiPokok + (tunjanganMakan * getJumlahKehadiran());
    }


    public int hitungGaji(int bonusKinerja) {
        return hitungGaji() + bonusKinerja;
    }

    void halo(){
        System.out.println("saya dalah budak");
    }
}
