import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        Scanner inp = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka yang dicari: ");
            int target = inp.nextInt();

            boolean found = false;

            outerLoop:
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        found = true;
                        break outerLoop;
                    }
                }
            }

            if (!found) {
                System.out.println("Angka " + target + " tidak ditemukan dalam array.");
            }

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.toString());
        } finally {
            inp.close();
        }
    }
}