class Book extends LibraryItem {
    String author;

    public Book(String author, String title, int itemId, boolean isBorrowed) {
        super(title, itemId, isBorrowed);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Buku: " + title + " oleh " + author + ", ID: " + itemId;
    }

    @Override
    public String borrowItem(int days) {
        if (days > 14) {
            throw new IllegalArgumentException("Maksimal peminjaman buku adalah 14 hari");
        }

        if (isBorrowed) {
            throw new IllegalArgumentException("Buku sedang dipinjam");

        }

        isBorrowed = true;
        return "item " + title + " behasil dipinjam selama " + days + " hari";
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 10000;
    }
}

