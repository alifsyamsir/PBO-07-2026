//try catch
import java.util.Scanner;

public class tp1_2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Masukkan tanggal (dd-mm-yy): ");
    String date = in.nextLine();

try {
    String[] format = date.split("-");
    if (format.length != 3) {
    System.out.println("Input tidak valid! Harus angka dengan format dd-mm-yy");
    return;
    }
    int tanggal = Integer.parseInt(format[0]);
    String[] namaBulan = {"Januari", "Februari","Maret", "April","Mei", "Juni", "Juli","Agustus", "September", "Oktober", "November", "Desember"};
    int bulan = Integer.parseInt(format[1]);
    int tahun = Integer.parseInt(format[2]);
    if (tanggal <= 0 || tanggal > 31 || bulan <= 0 || bulan > 12) {
            System.out.println("Tanggal atau bulan tidak valid!");
            return;
        }
    String nama = namaBulan[bulan -1];
    if (tahun >= 0 && tahun <= 26) {
                tahun += 2000;
        } else if (tahun <= 99) {
            tahun += 1900;
        } else {
            System.out.println("Format tahun salah!");
            return;
        }System.out.print(tanggal + " " + nama + " "+ tahun + " ");
} catch (Exception e) {
    System.out.println("Input tidak valid! Harus angka dengan format dd-mm-yy");
}


    }
}
