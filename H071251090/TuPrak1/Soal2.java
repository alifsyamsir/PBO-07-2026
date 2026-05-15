package TuPrak1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Input tanggal (dd-mm-yy): ");
        String input = x.nextLine();

        String[] ke = input.split("-");
        int hari = Integer.parseInt(ke[0]);
        int bulan = Integer.parseInt(ke[1]);
        int tahun = Integer.parseInt(ke[2]);

        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April",
            "Mei", "Juni", "Juli", "Agustus",
            "September", "Oktober", "November", "Desember"
        };

        if (tahun < 50) {
            tahun += 2000;
        } else {
            tahun += 1900;
        }

        System.out.println(hari + " " + namaBulan[bulan - 1] + " " + tahun);
    }
}