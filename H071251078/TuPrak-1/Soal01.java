import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan Judul Film : ");
        String input = inp.nextLine();

        String output = kapitalisasiHuruf(input);
        System.out.println(output);
        inp.close();
    }

    public static String kapitalisasiHuruf(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                String kapitalisasi = Character.toUpperCase(words[i].charAt(0))
                + words[i].substring(1).toLowerCase();
                result.append(kapitalisasi);
            }
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}