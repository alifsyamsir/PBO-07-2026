import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class Library {
    List<LibraryItem> items;
    List<Member> members;
    LibraryLogger logger;

    Library() {
        items= new ArrayList<>();
        members = new ArrayList<>();
        logger = new LibraryLogger();
    }

    String addItem(LibraryItem item) {
        items.add(item);
        return item.title + " berhasil ditambahkan";
    }

    LibraryItem findItemById(int itemId) {
        for (LibraryItem item : items) {
            if (item.itemId == itemId) {
                return item;
            }
        }
        throw new NoSuchElementException("Item dengan ID " + itemId + " tidak ditemukan");
    }

    String getLibraryStatus() {
        if (items.isEmpty()) {
            return "Tidak ada item";
        }

        String result = "";
        result += "+------+--------------+------------+\n";
        result += "| ID   | Judul        | Status     |\n";
        result += "+------+--------------+------------+\n";

        for (LibraryItem item : items) {
            String status = item.isBorrowed ? "Dipinjam" : "Tersedia";
            result += String.format("| %-4d | %-12s | %-10s |\n",item.itemId, item.title, status);
        }
        result += "+------+--------------+------------+";

        return result.toString();
    }
    String getAllLogs() {
        return logger.getLogs();
    }
}