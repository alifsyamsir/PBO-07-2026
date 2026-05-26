import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LibraryLogger {
    List<String> logs;

    LibraryLogger() {
        logs = new ArrayList<>();
    }

    String logActivity(String activity) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String timestamp = now.format(formatter);
        String log = timestamp + " | " + activity;

        logs.add(log);
        return log;
    }

    String getLogs() {
        if (logs.isEmpty()) {
            return "Tidak ada log";
        }

        String result = "";
        for (String log : logs) {
            result += log + "\n";
        }
        return result;
    }

    void clearLogs() {
        logs.clear();
    }
}
