package TuPrak1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Masukkan Judul Film: ");
        String teks = x.nextLine();

        String[] kata = teks.split(" ");
        String hasil = "";

        for (String k : kata) {
            if (k.length() > 0) {
                hasil += Character.toUpperCase(k.charAt(0)) 
                + k.substring(1).toLowerCase() + " ";
            }
        }
        System.out.println("Hasil: " + hasil.trim());
    }
}