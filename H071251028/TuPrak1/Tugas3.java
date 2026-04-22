//program untuk meminta input password dari pengguna dan validasi 
// dengan ketentuan:  
// a. Minimal 8 karakter  
// b. Harus mengandung huruf besar, huruf kecil, dan angka 


import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan password: ");
        String pass = sc.nextLine();

        if (isValid(pass)) {
            System.out.println("Password valid"); 
        } else {
            System.out.println("Password tidak valid"); 
        } 
    }

    public static boolean isValid(String pass) {
        if (pass.length() < 8) return false; 
        
        boolean hasUpper = false, hasLower = false, hasDigit = false;  //boolean buat cek benar salahnya
        for (char c : pass.toCharArray()) { 
            if (Character.isUpperCase(c)) hasUpper = true; 
            if (Character.isLowerCase(c)) hasLower = true; 
            if (Character.isDigit(c)) hasDigit = true;     
        }
        return hasUpper && hasLower && hasDigit;
        
    }
}
