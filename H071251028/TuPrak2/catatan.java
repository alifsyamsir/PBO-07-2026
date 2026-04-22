public class catatan {
    
}

public class Lightstick {
    //1. Deklarasi atribut (variabel) yang dimiliki Lightstick
    String warna;
    int tingkatCahaya; // Semakin terang, damage/poin semakin besar

    // 2. Constructor: Fungsinya untuk "membuat" objek Lightstick baru
    // Parameter 'warna' dan 'tingkatCahaya' akan mengisi atribut di atas
    public Lightstick(String warna, int tingkatCahaya) {
        this.warna = warna; // 'this.warna' merujuk ke atribut class, 'warna' merujuk ke parameter
        this.tingkatCahaya = tingkatCahaya;
    }
}

// Parameter = Lubang colokan (tempat nampung data).
// Argument = Steker/Colokannya (data aslinya).



public class IdolKpop {
    // ATRIBUT
    String namaIdol; // Menyimpan nama (Tipe data String)
    int poinPopularitas; // Menyimpan angka popularitas
    Lightstick lighstick; // Atribut bertipe Objek dari class lain (Syarat 1.a.o)

    // Constructor 1 tanpa parameter
    // ini kaya cetakan awal ki buat idol kpopnya jadi kalau mau tambah member tinggal tulis sj newidolkpop
    public IdolKpop() {
        this.namaIdol = "Trainee"; // Nama otomatis jadi Trainee
        this.poinPopularitas = 50; // Poin otomatis 50
        this.lighstick = new Lightstick("Putih", 10); // Otomatis dapat LS putih
        // pake this kalau misalkan nama atriubutnya sama dengan nama objeknya
        // utnuk membedakan atribut dengan objek
    }

    // Constructor 2 dengan Parameter
    // Digunakan kalau kita mau buat Idol dengan nama & LS spesifik
    public IdolKpop(String nama, int poin, Lightstick ls) {
        this.namaIdol = nama;
        this.poinPopularitas = poin;
        this.lighstick = ls;
    }

    // 3. Behavior (Method) 
    // Method 1: Berinteraksi langsung dengan atribut objek itu sendiri
    public void latihanVokal(int jam) {
        // Menambah poin popularitas berdasarkan jam latihan
        this.poinPopularitas += (jam * 2); // jadi kalau dia latihan fokal 1 jam berrati poinnya ditambah 2
        System.out.println(namaIdol + " latihan vokal selama " + jam + " jam. Poin naik!");
    }

    // Method 2: Interaksi antar objek dari class yang sama (Syarat 3)
    // 'IdolKpop lawan' artinya method ini butuh objek Idol lain sebagai target
    public void aduPopularitas(IdolKpop lawan) {
        System.out.println(this.namaIdol + " adu popularitas dengan " + lawan.namaIdol);
        
        // Menggunakan kekuatan lighstick untuk mengurangi poin lawan
        lawan.poinPopularitas -= this.lighstick.tingkatCahaya;
        
        System.out.println("Poin " + lawan.namaIdol + " berkurang karena silau cahaya lighstick!");
        System.out.println("Sisa poin " + lawan.namaIdol + ": " + lawan.poinPopularitas);
    }
    
    public void tampilkanStatus() {
        System.out.println("--- Status Idol ---");
        System.out.println("Nama: " + namaIdol);
        System.out.println("Poin: " + poinPopularitas);
        System.out.println("Warna LS: " + lighstick.warna);
        System.out.println("-------------------");
    }

    
}


public class Main {
    public static void main(String[] args) {
        // 1. Persiapan Objek Pendukung (Lightstick)
        Lightstick lsBiru = new Lightstick("Biru", 15);
        Lightstick lsNeon = new Lightstick("Hijau Neon", 20);

        // 2. Membuat Objek Idol (IdolKpop)
        IdolKpop idol1 = new IdolKpop("Martin", 100, lsBiru);
        IdolKpop idol2 = new IdolKpop("Mark", 100, lsNeon);

        // 3. Menampilkan Status Awal
        System.out.println("=== STATUS AWAL ===");
        idol1.tampilkanStatus();
        idol2.tampilkanStatus();
        System.out.println();

        // 4. BAGIAN TAMBAHAN: Memanggil Method Latihan Vokal
        // Kita suruh martin latihan selama 5 jam
        idol1.latihanVokal(5); 
        
        // Kita suruh Mark latihan selama 3 jam
        idol2.latihanVokal(3);
        System.out.println();

        // 5. Menampilkan Status Setelah Latihan (Poin pasti sudah naik)
        System.out.println("=== STATUS SETELAH LATIHAN ===");
        idol1.tampilkanStatus();
        idol2.tampilkanStatus();
        System.out.println();

        // 6. Melakukan Adu Popularitas (Interaksi Antar Objek)
        System.out.println("=== PERTEMPURAN POPULARITAS ===");
        idol1.aduPopularitas(idol2); // Martin menyerang Mark
        
        System.out.println("\n=== HASIL AKHIR ===");
        idol2.tampilkanStatus(); // Cek poin Mark yang berkurang
    }
}