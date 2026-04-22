public class Main {
    public static void main(String[] args) {
        
        Lightstick lsBiru = new Lightstick("Biru", 15);
        Lightstick lsNeon = new Lightstick("Hijau Neon", 20);

        IdolKpop idol1 = new IdolKpop("Martin", 100, lsBiru);
        IdolKpop idol2 = new IdolKpop("Mark", 100, lsNeon);

        System.out.println("=== STATUS AWAL ===");
        idol1.tampilkanStatus();
        idol2.tampilkanStatus();
        System.out.println();

        idol1.latihanVokal(5); 
        
        idol2.latihanVokal(3);
        System.out.println();

        System.out.println("=== STATUS SETELAH LATIHAN ===");
        idol1.tampilkanStatus();
        idol2.tampilkanStatus();
        System.out.println();

        System.out.println("=== PERTEMPURAN POPULARITAS ===");
        idol1.aduPopularitas(idol2); 
        
        System.out.println("\n=== HASIL AKHIR ===");
        idol2.tampilkanStatus(); 
    }
}