package Num01;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== KARYAWAN TETAP ===");
        KaryawanTetap kartep = new KaryawanTetap("Halim", "TDR-3000", 4500000, 50000);
        for (int i = 0; i < 15; i++) kartep.absen();
 
        double gajiDasar   = kartep.hitungGaji();
        double gajiDenganBonus = kartep.hitungGaji(500000);
 
        System.out.println("\n--- Rekap Gaji ---");
        System.out.printf("Gaji tanpa bonus: Rp%,.0f%n", gajiDasar);
        System.out.printf("Gaji + bonus kinerja: Rp%,.0f%n", gajiDenganBonus);

        
        System.out.println("\n=== KARYAWAN KONTRAK ===");
        KaryawanKontrak karkon = new KaryawanKontrak("Laun", "KK-020", 200000);
        for (int i = 0; i < 21; i++) karkon.absen();
 
        double gajiKontrak = karkon.hitungGaji();
 
        System.out.println("\n--- Rekap Gaji ---");
        System.out.printf("Total Gaji: Rp%,.0f%n", gajiKontrak);
    }
}