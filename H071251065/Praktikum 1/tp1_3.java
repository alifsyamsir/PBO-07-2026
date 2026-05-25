import java.util.Scanner;
public class tp1_3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Masukkan password: ");
    String pw = in.nextLine();
    boolean adaUpper, adaLower, adaAngka;
    adaAngka = false;
    adaLower = false;
    adaUpper =false;

        for (int i = 0; i < pw.length(); i++) {
            char kata = pw.charAt(i);

            if (Character.isUpperCase(kata)) {
                adaUpper = true;
            }else if (Character.isLowerCase(kata)) {
                adaLower = true;
            }else if (Character.isDigit(kata)) {
                adaAngka = true;
            }
        }
        if (pw.length() >= 8 && adaUpper && adaLower && adaAngka) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
    }
}
}