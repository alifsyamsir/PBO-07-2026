import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LibraryLogger {
    private List<String> logs;
    private DateTimeFormatter formatter;

    public LibraryLogger() {
        this.logs = new ArrayList<>();
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    public String logActivity(String activity) {
        String timestamp = LocalDateTime.now().format(formatter);
        String entry = timestamp + " " + activity;
        logs.add(entry);
        return entry;
    }

    public String getLogs() {
        if (logs.isEmpty()) {
            return "Belum ada log aktivitas";
        }
        StringBuilder stbu = new StringBuilder();
        for (int i = 0; i < logs.size(); i++) {
            stbu.append(logs.get(i));
            if (i < logs.size() - 1) {
                stbu.append("\n");
            }
        }
        return stbu.toString();
    }

    public void clearLogs() {
        logs.clear();
    }

    public List<String> getLogList() {
        return logs;
    }
}