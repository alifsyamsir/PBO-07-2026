package soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        KaryawanTetap kt = new KaryawanTetap("Akew", "KT99", 3500000, 1500000);
        System.out.println("Jumlah kehadiran karyawan tetap: "); int absenkt = a.nextInt();
        for (int i = 0; i < absenkt; i++) {
            kt.absen();
        }
        kt.tampilkanInfo();
        kt.halo();
        System.out.println("Gaji tetap + bonus\t: " + kt.hitungGaji(1000000));

        KaryawanKontrak kk = new KaryawanKontrak("Bi Eem", "KK01", 1200000);
        System.out.println("\nJumlah kehadiran karywan kontrak: "); int absenkk = a.nextInt();
        
        for (int i = 0; i < absenkk; i++) {
            kk.absen();
        }
        kk.tampilkanInfo();
        System.out.println("Gaji kontrak\t\t: " + kk.hitungGaji());
        a.close();
    }
}
