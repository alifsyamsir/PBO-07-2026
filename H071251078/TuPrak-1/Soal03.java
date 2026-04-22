import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = inp.nextLine();

        String result = validasiPassword(password);
        System.out.println(result);
        inp.close();
    }

    public static String validasiPassword(String password) {
        if (password.length() < 8) {
            return "Password tidak valid";
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (hasUpper && hasLower && hasDigit) {
            return "Password valid";
        } else {
            return "Password tidak valid";
        }
    }
} 