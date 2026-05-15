import java.util.List;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, int itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Buku: " + title + " oleh " + author + ", ID: " + itemId;
    }

    @Override
    public String borrowItem(int days) {
        if (isBorrowed) {
            throw new IllegalArgumentException("Buku " + title + " sudah dipinjam");
        }
        if (days > 14) {
            throw new IllegalArgumentException("Buku hanya bisa dipinjam maksimal 14 hari");
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
        return daysLate * 10000;
    }

    public String getAuthor() {
        return author;
    }

    public static void printBooks(List<Book> books) {
        if (books == null || books.isEmpty()) {
            System.out.println("Tidak ada buku");
            return;
        }
        for (Book b : books) {
            System.out.println(b.getDescription());
        }
    }
}