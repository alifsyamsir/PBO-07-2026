package Praktikum5;

public class Main {
    public static void main(String[] args) {
    KaryawanTetap karyawan1= new KaryawanTetap("Zahwa", "00", 100000000, 1000000);
    karyawan1.absen();
    karyawan1.absen();
    karyawan1.absen();

    System.out.println("=== Karyawan Tetap ===");
        System.out.println("Nama: " + karyawan1.getNama());
        System.out.println("ID: " +karyawan1.getIdKaryawan());
        System.out.println("Kehadiran: " + karyawan1.getJumlahKehadiran() + " hari");
        System.out.println("Total Gaji: Rp" + karyawan1.hitungGaji(100000000));

    KaryawanKontrak karyawan2 = new KaryawanKontrak("hayan", "11", 50000000);
    
    for (int i = 0; i <= 20; i++) {  
            karyawan2.absen();
        }
        System.out.println("=== Karyawan Kontrak ===");
        System.out.println("Nama: " + karyawan2.getNama());
        System.out.println("ID: " + karyawan2.getIdKaryawan());
        System.out.println("Kehadiran: " + karyawan2.getJumlahKehadiran() + " hari");
        System.out.println("Total Gaji: Rp" + karyawan2.hitungGaji()); 
    }
}
