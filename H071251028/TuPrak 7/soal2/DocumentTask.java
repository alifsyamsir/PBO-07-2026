package soal2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class DocumentTask implements Runnable {

    private String fileName;
    private DataProcessor processor;
    private ConcurrentHashMap<String, Result> storage;
    private CountDownLatch latch;

    public DocumentTask(String fileName, DataProcessor processor,
                        ConcurrentHashMap<String, Result> storage,
                        CountDownLatch latch) {
        this.fileName = fileName;
        this.processor = processor;
        this.storage = storage;
        this.latch = latch;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        Result r = processor.process(fileName, threadName);

        storage.put(fileName, r);

        System.out.println("[" + threadName + "] Selesai memproses " +
                fileName + " (" + r.wordCount + " kata).");

        latch.countDown();
    }
}