//  method yang berfungsi merubah huruf pertama dari tiap kata menjadi kapital

import java.util.Scanner; 

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan Judul Film : "); 
        String input = sc.nextLine();  
        System.out.println(toTitleCase(input)); 
    }

    public static String toTitleCase(String text) { 
        String[] words = text.split(" ");  
        StringBuilder result = new StringBuilder(); 
        for (String word : words) {                       
            if (word.length() > 0) { 
                result.append(Character.toUpperCase(word.charAt(0))) 
                      .append(word.substring(1).toLowerCase()) 
                      .append(" "); 
            }
        }
        return result.toString().trim(); 
    }
}