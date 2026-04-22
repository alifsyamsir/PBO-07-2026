// mengkonversi tanggal dalam format "dd-mm-yy" menjadi format lebih jelas "d NamaBulan yyyy". 
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] bulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"}; 
        
        System.out.print("Input: "); 
        String input = sc.nextLine();  
        String[] parts = input.split("-"); 
        
        int tgl = Integer.parseInt(parts[0]); 
        int bln = Integer.parseInt(parts[1]); 
        int thn = Integer.parseInt(parts[2]);
         
        String fullYear = (thn < 26) ? "20" + parts[2] : "19" + parts[2];
        

        System.out.println("Output: " + tgl + " " + bulan[bln] + " " + fullYear); 
    }
}