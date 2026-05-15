public class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, int itemId, int duration) {
        super(title, itemId);
        this.duration = duration;
    }

    @Override
    public String getDescription() {
        return "DVD: " + title + ", durasi " + duration + " menit, ID: " + itemId;
    }

    @Override
    public String borrowItem(int days) {
        if (isBorrowed) {
            throw new IllegalArgumentException("DVD " + title + " sudah dipinjam");
        }
        if (days > 7) {
            throw new IllegalArgumentException("DVD hanya bisa dipinjam maksimal 7 hari");
        }
        if (days <= 0) {
            throw new IllegalArgumentException("Jumlah hari harus lebih dari 0");
        }
        return "Item " + title + " berhasil dipinjam selama " + days + " hari";
    }

    @Override
    public double calculateFine(int daysLate) {
        if (daysLate <= 0) {
            return 0;
        }
        return daysLate * 25000;
    }

    public int getDuration() {
        return duration;
    }
}