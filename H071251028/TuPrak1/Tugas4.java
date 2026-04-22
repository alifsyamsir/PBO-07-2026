// program yang meminta bilangan n, lalu hitung n! (faktorial)  menggunakan rekursi
//Rekursi adalah sebuah teknik di mana sebuah method memanggil dirinya sendiri.

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Input: "); 
        int n = sc.nextInt(); 
        
    if (n < 0) {
        System.out.println("Output: Tidak terdefinisi");
    } else {
        System.out.println("Output: " + factorial(n));
    }
}
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);  
    }
}