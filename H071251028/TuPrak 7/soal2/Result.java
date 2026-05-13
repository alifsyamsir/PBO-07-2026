package soal2;

public class Result {
    String threadName;
    long duration;
    int words;

    public Result(String threadName, long duration, int words) {
        this.threadName = threadName;
        this.duration = duration;
        this.words = words;
    }
}