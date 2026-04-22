public class klolupa {
    
}
////  method yang berfungsi merubah huruf pertama dari tiap kata menjadi kapital

import java.util.Scanner; // memanggil library Scanner milik Java agar program bisa membaca inputan

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat objek scanner baru bernama sc. System.in artinya kita mengambil input dari standar input
        System.out.print("Masukkan Judul Film : "); 
        String input = sc.nextLine(); // kaya perintah buat program selesaiin kalimat kita dulu baru dia lanjut ke perintah selanjutnya
        System.out.println(toTitleCase(input)); // buat kasi masuk teks yang ada di input ke totitlecase
    }

    public static String toTitleCase(String text) { // ini buat ganti nama yang ada di variabel input ke text
        String[] words = text.split(" "); // kalimat panjang jadi perkata n hasil potonganna diksimasu aray
        StringBuilder result = new StringBuilder(); //buat di susun kemblii
        for (String word : words) { // buat setiap kata yang ada di variabel words lakukan perintah di bawah ini                      
            if (word.length() > 0) { // buat bikin minimal ada 1 huruf di setiap kata karena dari split yang diatas bisajadi ada kata kosong karena spasi nah jadi dia hitung kata yang ada di kalimat saja
                result.append(Character.toUpperCase(word.charAt(0))) // Mengambil huruf pertama (indeks 0) dan dipaksa jadi KAPITAL.
                      .append(word.substring(1).toLowerCase()) // Mengambil sisa hurufnya (dari urutan kedua sampai habis) dan dipaksa jadi huruf kecil
                      .append(" "); //Memberikan spasi lagi di antara kata supaya tidak dempet-dempet.
            }
        }
        return result.toString().trim(); // buat hasilnya nanti tidak ta print biasa ki tapi bisa ki ta simpan di file atau diamana terus dia pake tostring karena diatas kita pake stringbuilder jadi harus dubah jadi string terus pake trim karena kita tadi append spasi setiap akhir kata jadi ini buat hapus spasi di akhir kata
    }
}










// mengkonversi tanggal dalam format "dd-mm-yy" menjadi format lebih jelas "d NamaBulan yyyy". 

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //// Membuat objek scanner baru bernama sc. System.in artinya kita mengambil input dari standar input
        String[] bulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"}; // array pertama kosong karena itu terhitung bulan 0
        
        System.out.print("Input: "); //pake print biasa karena di baris yang sama. prtintln untuk baris baru
        String input = sc.nextLine();  // // kaya perintah buat program selesaiin kalimat kita dulu baru dia lanjut ke perintah selanjutnya
        String[] parts = input.split("-"); // buat potong tanda -
        
        int tgl = Integer.parseInt(parts[0]); // buat diubah jadi integer (angka bulat) buat kasi hilang 01 jadi 1
        int bln = Integer.parseInt(parts[1]); // parts 1 2 3 itu dari split yang diatas 01-02-03
        int thn = Integer.parseInt(parts[2]);
         
        String fullYear = (thn < 50) ? "20" + parts[2] : "19" + parts[2];
        // ini intinya kaya kalau tahun yang di input kurang dari 50 dia ditambah 20 di depannya tapi kalau tidak dia ditambah 19 di depannya
        // ? itu if : itu else

        System.out.println("Output: " + tgl + " " + bulan[bln] + " " + fullYear); 
    }
}










//program untuk meminta input password dari pengguna dan validasi 
// dengan ketentuan:  
// a. Minimal 8 karakter  
// b. Harus mengandung huruf besar, huruf kecil, dan angka 


import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //// Membuat objek scanner baru bernama sc. System.in artinya kita mengambil input dari standar input
        System.out.print("Masukkan password: ");
        String pass = sc.nextLine(); //// kaya perintah buat program selesaiin kalimat kita dulu baru dia lanjut ke perintah selanjutnya

        if (isValid(pass)) {
            System.out.println("Password valid"); 
        } else {
            System.out.println("Password tidak valid"); 
        } // kalau pass nya true dia keluar valid kalau false dia keluar invalid
    }

    public static boolean isValid(String pass) { // ini buat dia kasi jawaban ya atau tidak saja
        if (pass.length() < 8) return false; // kalau karkter kurang dari 8 maka langsung false jadi nd usah cek karakter
        
        boolean hasUpper = false, hasLower = false, hasDigit = false; // ini kondisi awal syaratnya sebelum di cek betul atau nda
        for (char c : pass.toCharArray()) { // buat ubah teks per karakter kya A B C 1
            if (Character.isUpperCase(c)) hasUpper = true; // ini kalau sidah di cek jadi true
            if (Character.isLowerCase(c)) hasLower = true; 
            if (Character.isDigit(c)) hasDigit = true;     
        }
        return hasUpper && hasLower && hasDigit;
        // kalau true semua dia terprint valid tapi kalau ada yang tidak true dia terprint invalid
    }
}






// program yang meminta bilangan n, lalu hitung n! (faktorial)  menggunakan rekursi
//Rekursi adalah sebuah teknik di mana sebuah method memanggil dirinya sendiri.

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat objek scanner baru bernama sc. System.in artinya kita mengambil input dari standar input
        System.out.print("Input: "); 
        int n = sc.nextInt(); // ini buat nyimpan angka berapapun yang dikasi masuk ke n
        System.out.println("Output: " + factorial(n)); 
    }

    public static int factorial(int n) {  //ini buat masstiin hasilnya nanti angka bulat (integer)
        if (n <= 1) return 1; //kalau angka yang dikasi masuk itu angka 1 atau kurang dari satu hasilnya langsung 1
        return n * factorial(n - 1);  // kenapa dikurang satu karena supaya dia cek semua angka sebelumnya sampai dia dapat angka 1 baru dia berhenti
    }
}





// input satu buah bilangan, kemudian buat perulangan untuk mencari angka tersebut dari array 2d yang dibuat sebelumnya. 
// matriks 3x3

import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // pake 2 kolom array karena ini 2d
        Scanner sc = new Scanner(System.in); //// Membuat objek scanner baru bernama sc. System.in artinya kita mengambil input dari standar input
        
        try { // try maksudnya covba jalankan kode ini dulu
            System.out.print("Input: "); 
            int cari = sc.nextInt(); // buat nyimpan angka berapapun yang di input ke cari
            
            boolean found = false; // kondisi awal sebelum di cek
            search: 
            for (int i = 0; i < nums.length; i++) { // i itu variabel loop luar atau buat baris, jadi dia hitung yang paling atas dlu baru dia tambah ke 2 baru hasil dari 2 ditembah 1 jadi tiga trus stop sampe situ mi
                for (int j = 0; j < nums[i].length; j++) { // sama ji dengan loop luar tapi ini loop dalam dia hitung bagian kolom. [i] itu buat cek di baris nomor ini ada berapa banyak kotak di dalamnya
                    if (nums[i][j] == cari) { // ini buat cek bagian kolom sama baris sama ji kah sama inpoutan yang masuk di cari
                        System.out.println("Found " + cari + " at [" + i + "] [" + j + "]"); // buat cari apakah ada atau tidak teruss kalau ada dia kasi tau juga kordinat atau lokasinya 
                        found = true;
                        break search; // langsung "lompat keluar" dari semua perulangan supaya program lebih cepat selesai.
                    }
                }
            }
            if (!found) System.out.println("Angka tidak ditemukan."); // ! itu artinya tidak atau bukan, jadi kalau tidak ketemu dia keluar ini
        } catch (Exception e) { // ada kesalahan kya huruf dia tdk lngsug kluar
            System.out.println("Terjadi kesalahan input!"); 
        }
    }
}