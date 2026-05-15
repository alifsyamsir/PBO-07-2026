package TuPrak5.Soal1;

public class Main {
    public static void main(String[] args) {

        KaryawanTetap tetap = new KaryawanTetap("Andi", "KT-001", 5000000, 30000);
        for (int i = 0; i < 22; i++) tetap.absen();

        System.out.println("=== Karyawan Tetap ===");
        System.out.println("Nama       : " + tetap.getNama());
        System.out.println("Kehadiran  : " + tetap.getJumlahKehadiran() + " hari");
        System.out.println("Gaji Pokok : Rp" + tetap.hitungGaji());
        System.out.println("+ Bonus    : Rp" + tetap.hitungGaji(1000000));

        KaryawanKontrak kontrak = new KaryawanKontrak("Budi", "KK-001", 200000);
        for (int i = 0; i < 23; i++) kontrak.absen();

        System.out.println("\n=== Karyawan Kontrak ===");
        System.out.println("Nama       : " + kontrak.getNama());
        System.out.println("Kehadiran  : " + kontrak.getJumlahKehadiran() + " hari");
        System.out.println("Total Gaji : Rp" + kontrak.hitungGaji());
    }
}