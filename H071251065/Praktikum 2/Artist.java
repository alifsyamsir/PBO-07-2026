class Artist {
    String nama;
    String style;
    Artwork artwork; // atribut objek

    // constructor default
    Artist() {
        this.nama    = "Sang Misterius";
        this.style   = "Unknown";
        this.artwork = new Artwork();
    }

    // constructor parameter
    public Artist(String nama, String style, Artwork artwork) {
        this.nama = nama;
        this.style = style;
        this.artwork = artwork;
    }

    // method 1,show (interaksi sm object artwork)
    public void show() {
        System.out.println("\n" + nama + " membuka tirai karyanya...");
        System.out.println(">>> '" + artwork.karya + "' hadir dengan sentuhan " + style);

        artwork.popularity += 10;
        artwork.visitors += 5;

        // validasi batas popularity (0 -100)
        if (artwork.popularity > 100) {
            artwork.popularity = 100;
            System.out.println("Karya ini mencapai puncak ketenaran di Mystique!");
        } else {
            System.out.println("Aura karya mulai menarik perhatian pengunjung...");
        }

        if (artwork.popularity < 0) {
            artwork.popularity = 0;
        }

        artwork.updateRanking();
    }

    // method 2, interaksi antar object
    public void compete(Artist rival) {
        System.out.println("\n=== MYSTIQUE ART DUEL ===");
        System.out.println(nama + " VS " + rival.nama);
        System.out.println("(Penilaian berdasarkan daya tarik pengunjung saat ini...siapakah yang lebih BERAURA?)");

        if (this.artwork.visitors > rival.artwork.visitors) {
            System.out.println("\nJENG!! Karya " + nama + " GACOR! memukau pengunjung!");
            this.artwork.popularity += 15;
            rival.artwork.popularity -= 5;
        } else {
            System.out.println("\nJENG!! Karya " + rival.nama + " lebih MENYALA!");
            rival.artwork.popularity += 15;
            this.artwork.popularity -= 5;
        }

        // validasi batas
        this.validatePopularity();
        rival.validatePopularity();

        this.artwork.updateRanking();
        rival.artwork.updateRanking();

    }
    public void validatePopularity() {
        if (artwork.popularity > 100) {
            artwork.popularity = 100;
        }
        if (artwork.popularity < 0) {
            artwork.popularity = 0;
        }
    }

    // status
    public void cekStatus() {
        System.out.println("\n=== Status Artist ===");
        System.out.println("Nama: " + nama);
        System.out.println("Style: " + style);
        System.out.println("Karya: " + artwork.karya);
        System.out.println("Popularity: " + artwork.popularity + "/100");
        System.out.println("Visitors: " + artwork.visitors);
        System.out.println("Ranking: " + artwork.ranking);
    }
}