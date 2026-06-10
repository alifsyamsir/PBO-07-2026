package soal1;

public class KaryawanKontrak extends Karyawan {
    private int upahPerHari;

    public KaryawanKontrak(String nama, String idKaryawan, int upahPerHari) {
        super(nama, idKaryawan);
        this.upahPerHari = upahPerHari;
    }

    @Override
    public int  hitungGaji() {
        int totalGaji = upahPerHari * getJumlahKehadiran();
        
        if (getJumlahKehadiran() > 20) {
            totalGaji += 500000;  
        } 
        return totalGaji;
    }
    
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Upah Per Hari\t\t: " + upahPerHari);
        //System.out.println("Hitung gaji\t\t: "+ hitungGaji());
    }
}
