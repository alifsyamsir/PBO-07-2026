import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


class LibraryLogger {
    ArrayList<String> logs = new ArrayList<>();

    public void logActivity(String activity) {
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String waktuDiformat = waktu.format(format);
        logs.add(waktuDiformat +  " - " + activity);
    }

    public String getLogs() {
        return String.join("\n", logs);
    }

    public void clearLogs(){
        logs.clear();
    }

    

}
