import java.util.Scanner;
public class tp1_4 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int angka =  in.nextInt(); 
    int hasil = faktorial(angka);
    System.out.println(hasil);   
    }
    //base case
    public static int faktorial(int n){
        if (n==0){
            return 1;
        }else{
            return n * faktorial(n-1);
        }
    }
    // public static void main(String[] args) {
    // Scanner in = new Scanner(System.in);
    // int angka =  in.nextInt(); 
    // int hasil = faktorial(angka);
    // System.out.println(hasil);   
    // }

}
