package TuPrak6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LibraryLogger {
    private List<String[]> logs;
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public LibraryLogger() {
        this.logs = new ArrayList<>();
    }

    public String logActivity(String activity) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        String entry = timestamp + " " + activity;
        logs.add(new String[]{entry});
        return entry;
    }

    public void logBorrow(String timestamp, String title, String memberName) {
        logs.add(new String[]{timestamp, title, memberName, "-"});
    }

    public void logReturn(String title, String memberName, String returnTime) {
        for (String[] log : logs) {
            if (log.length == 4 && log[1].equals(title) && log[2].equals(memberName) && log[3].equals("-")) {
                log[3] = returnTime;
                return;
            }
        }
    }

    public String getLogs() {
        if (logs.isEmpty()) return "Tidak ada log aktivitas.";

        int col1 = 20, col2 = 30, col3 = 15, col4 = 20;
        String border = "+" + "-".repeat(col1) + "+" + "-".repeat(col2) + "+" +
                "-".repeat(col3) + "+" + "-".repeat(col4) + "+";
        StringBuilder sb = new StringBuilder();
        sb.append(border).append("\n");
        sb.append(String.format("| %-" + (col1 - 2) + "s | %-" + (col2 - 2) + "s | %-" +
                (col3 - 2) + "s | %-" + (col4 - 2) + "s |%n",
                "Dipinjam pada", "Judul", "Member", "Dikembalikan pada"));
        sb.append(border).append("\n");

        for (String[] log : logs) {
            if (log.length == 4) {
                sb.append(String.format("| %-" + (col1 - 2) + "s | %-" + (col2 - 2) + "s | %-" +
                        (col3 - 2) + "s | %-" + (col4 - 2) + "s |%n",
                        log[0], log[1], log[2], log[3]));
            }
        }
        sb.append(border);
        return sb.toString();
    }

    public void clearLogs() {
        logs.clear();
    }
}