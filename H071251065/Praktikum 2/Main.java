public class Main {
    public static void main(String[] args) {
        System.out.println("=== Mystique ===");
        System.out.println("Selamat datang di galeri seni penuh AURA MYSTIC...\n");

        Artwork a1 = new Artwork("White Blood", 50, 90);
        Artist art1 = new Artist("Hayansr", "Dark Surrealism", a1);

        Artwork a2 = new Artwork("Abyssal Black Flame Dragon", 60, 95);
        Artist art2 = new Artist("Dokjae", "Mystic Flow", a2);
        
        // Artwork a3 = new Artwork();
        // Artist art3 = new Artist();

        art1.show();
        art2.show();
        // art3.show();

        art1.compete(art2);

        art1.cekStatus();
        art2.cekStatus();
        // art3.cekStatus();

        System.out.println("\nPameran Mystique selesai...");
    }
}

