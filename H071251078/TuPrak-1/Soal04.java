import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = inp.nextInt();

        int hasil = faktorial(n);
        System.out.println("Hasil " + n + "! = " + hasil);
        inp.close();
    }

    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
} 