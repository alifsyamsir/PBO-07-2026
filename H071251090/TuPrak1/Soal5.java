package TuPrak1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nums = {{1, 2, 3}, 
                        {4, 5, 6}, 
                        {7, 8, 9}};

        try {
            System.out.print("Input: ");
            int target = sc.nextInt();

            boolean Ketemu = false;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        Ketemu = true;
                        break;
                    }
                }
                if (Ketemu) break;
            }

            if (!Ketemu) {
                System.out.println("Angka tidak ditemukan");
            }

        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        }
    }
}