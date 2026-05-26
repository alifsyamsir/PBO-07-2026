import java.util.Scanner;
public class tp1_5 {
    public static void main(String[] args) {
    int[][] nums = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };  
    Scanner in = new Scanner(System.in);
    int input=0;
    try {
        System.out.println();
        input = in.nextInt();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == input) {
                System.out.println("Found " +input + " at [" + i + "][" + j + "]");
                return;
            }
                }
            }   
            System.out.println("Angka tidak ditemukan");
        }catch (Exception e) {
            System.out.println("Input harus berupa angka");
        }
    
    }
}
