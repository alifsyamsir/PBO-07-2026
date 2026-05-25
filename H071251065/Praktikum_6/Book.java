class Book extends LibraryItem {
    String author;

    Book(String title, int itemId, boolean isBorrowed, String author) {
        super(title, itemId, isBorrowed);
        this.author= author;
    }
    @Override
    String borrowItem(int days) {
        if (this.isBorrowed) {
            throw new IllegalArgumentException("Buku sedang dipinjam");
        }
        if (days > 14) {
            throw new IllegalArgumentException("Buku hanya dapat dipinjam maksimal 14 hari");
        }
        isBorrowed = true;
        return "Item " +title + " berhasil dipinjam selama " +days +" hari";
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 10000;
    }
    @Override
    String getDescription() {
        return "Buku: " + title+ " oleh "+ author + ", ID: "+ itemId;
    }
}