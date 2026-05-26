class Artwork {
    String karya;
    int popularity;
    int visitors;
    int ranking;

    Artwork() {
        this.karya      = "Tidak Ditemukan";
        this.popularity = 0;
        this.visitors   = 0;
        this.ranking    = 3;
    }

    Artwork(String karya, int popularity, int visitors) {
        this.karya = karya;
        this.visitors = visitors;

        // validasi awal
        if (popularity > 100) {
            this.popularity = 100;
        } else if (popularity < 0) {
            this.popularity = 0;
        } else {
            this.popularity = popularity;
        }

        updateRanking();
    }

    // update ranking
    public void updateRanking() {
        if (popularity >= 80) {
            ranking = 1;
        } else if (popularity >= 50) {
            ranking = 2;
        } else {
            ranking = 3;
        }
    }
}
