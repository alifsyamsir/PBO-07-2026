package library;

import java.util.ArrayList;

public class LibraryLogger {

    // Struktur tabel log pinjam/kembali
    public static class LogEntry {
        String time;
        String title;
        String member;
        String returnedAt;

        public LogEntry(String time, String title, String member, String returnedAt) {
            this.time = time;
            this.title = title;
            this.member = member;
            this.returnedAt = returnedAt;
        }
    }

    private ArrayList<LogEntry> logs = new ArrayList<>();
    //buat kasi pinjam sama kasi kembali
    private ArrayList<String> miscLogs = new ArrayList<>();
    //log umum 

    //loh aktivitas umumna
    public void logMisc(String text) {
        miscLogs.add(text);
    }

    // log pinjamna
    public void logBorrow(String time, String title, String member) {
        logs.add(new LogEntry(time, title, member, "-"));
    }


    //  Log Pengembalian

    public void logReturn(String time, String title, String member) {
        for (LogEntry entry : logs) {
            if (entry.title.equals(title) && entry.member.equals(member) && entry.returnedAt.equals("-")) {
                entry.returnedAt = time;
                return;
            }
        }
    }

    // format tabelna
    public String getFormattedLogs() {

        StringBuilder sb = new StringBuilder();

        // Log umum na
        if (!miscLogs.isEmpty()) {
            sb.append("=== Aktivitas Umum ===\n");
            for (String s : miscLogs) {
                sb.append("- ").append(s).append("\n");
            }
            sb.append("\n");
        }

        //kalau nda ada tidak ada log pinjam-kembali
        if (logs.isEmpty()) {
            sb.append("Belum ada aktivitas peminjaman.\n");
            return sb.toString();
        }

        sb.append(String.format("%-20s | %-30s | %-15s | %-20s\n",
                "Dipinjam pada", "Judul", "Member", "Dikembalikan pada"));
        sb.append("-----------------------------------------------------------------------------------------------\n");

        for (LogEntry log : logs) {
            sb.append(String.format("%-20s | %-30s | %-15s | %-20s\n",
                    log.time, log.title, log.member, log.returnedAt));
        }

        return sb.toString();
    }
}