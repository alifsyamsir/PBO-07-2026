package TuPrak1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Input: ");
        int n = x.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        System.out.println("Output: " + hasil);
    }
}