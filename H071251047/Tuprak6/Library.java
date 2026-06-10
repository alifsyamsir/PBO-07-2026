
import java.util.ArrayList;
import java.util.NoSuchElementException;

class Library {
    ArrayList <LibraryItem> items = new ArrayList<>();
    ArrayList <Member> members = new ArrayList<>();
    ArrayList<LibraryLogger> libraryLoggers = new ArrayList<>();

    public String addItem(LibraryItem item) {
        items.add(item);
        return item.title + " berhasil ditambahkan";
    }

    public LibraryItem findItemById(int itemId) {
        for (LibraryItem item : items) {
            if (item.itemId == itemId) {
                return item;
            }
        }
        throw new NoSuchElementException("Item tidak ditemukan: " + itemId);
    }

    public void getLibraryStatus() {
        System.out.println("╔══════╗════════════════════════════════╗══════════╗");
        System.out.println("║ ID   ║             JUDUL              ║ STATUS   ║");
        System.out.println("╠══════╣════════════════════════════════╣══════════╣");
        for (LibraryItem item : items) {
            String status;
            if (item.isBorrowed) {
                status = "Dipinjam";
            } else {
                status = "Tersedia";
            }
            System.out.printf("║ %-4d ║ %-30s ║ %-8s ║\n", item.itemId, item.title, status);
            
        System.out.println("╚══════╩════════════════════════════════╩══════════╝");
        }

    }

    public void getAllLogs(){
        for (LibraryLogger logger : libraryLoggers) {
            System.out.println(logger.getLogs());
        }
        
    }
}
