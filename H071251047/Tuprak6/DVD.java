class DVD extends LibraryItem {
    int duration;

    public DVD(int duration, String title, int itemId, boolean isBorrowed) {
        super(title, itemId, isBorrowed);
        this.duration = duration;
    }

    @Override
    public String getDescription() {
        return "DVD: " + title + ", durasi " + duration + " menit, ID:" + itemId; 
    }

    @Override
    public String borrowItem(int days) {
        if (days > 7 ) {
            throw new IllegalArgumentException("Maksimal peminjaman buku adalah 7 hari");
        }

        if (isBorrowed) {
            throw new IllegalArgumentException("DVD sedang dipinjam");
        }

        isBorrowed = true;
        return "item " + title + " behasil dipinjam selama " + days + " hari";

    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 25000;
    }
     
}
