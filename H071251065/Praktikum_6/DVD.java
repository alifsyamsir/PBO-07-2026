class DVD extends LibraryItem {
    int duration;

    DVD(String title, int itemId, boolean isBorrowed, int duration) {
        super(title, itemId, isBorrowed);
        this.duration= duration;
    }
    @Override
    String borrowItem(int days) {
         if (this.isBorrowed) {
            throw new IllegalArgumentException("DVD sedang dipinjam");
        }
        if (days > 7) {
            throw new IllegalArgumentException("DVD hanya dapat dipinjam maksimal 7 hari");
        }
        isBorrowed = true;
        return "Item " + title + " berhasil dipinjam selama " + days + " hari";
    }
    @Override
    double calculateFine(int daysLate) {
        return daysLate * 25000;
    }
    @Override
    String getDescription() {
        return "DVD: " + title+ ", durasi "+ duration + " menit, ID: "+ itemId;
    }
}
