package TuPrak1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = sc.nextLine();

        boolean adaUpper = false;
        boolean adaLower = false;
        boolean adaDigit = false;

        if (password.length() >= 8) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) adaUpper = true;
                if (Character.isLowerCase(c)) adaLower = true;
                if (Character.isDigit(c)) adaDigit = true;
            }
        }

        if (adaUpper && adaLower && adaDigit && password.length() >= 8) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }
    }
}