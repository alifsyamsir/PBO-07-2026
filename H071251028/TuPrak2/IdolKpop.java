
public class IdolKpop {
    String namaIdol;
    int poinPopularitas; 
    Lightstick lighstick; 

    
    public IdolKpop() {
        this.namaIdol = "Trainee"; 
        this.poinPopularitas = 50; 
        this.lighstick = new Lightstick("Putih", 10); // Otomatis dapat LS putih
    }


    public IdolKpop(String nama, int poin, Lightstick ls) {
        this.namaIdol = nama;
        this.poinPopularitas = poin;
        this.lighstick = ls;
    }


    public void latihanVokal(int jam) {
        
        this.poinPopularitas += (jam * 2); 
        System.out.println(namaIdol + " latihan vokal selama " + jam + " jam. Poin naik!");
    }

    public void aduPopularitas(IdolKpop lawan) {
        System.out.println(this.namaIdol + " adu popularitas dengan " + lawan.namaIdol);
        
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
