package soal2;

import java.util.Map;
import java.util.concurrent.*;

public class MainSoal2 {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(4);

        
        String[] documents = {
                "Doc_A.txt", "Doc_B.txt", "Doc_C.txt", "Doc_D.txt", "Doc_E.txt",
                "Doc_F.txt", "Doc_G.txt", "Doc_H.txt", "Doc_I.txt", "Doc_J.txt"
        };

        ConcurrentHashMap<String, Result> resultMap = new ConcurrentHashMap<>();

        CountDownLatch latch = new CountDownLatch(documents.length);

        DataProcessor processor = new DataProcessor();

        for (String doc : documents) {

            executor.submit(() -> {
                long start = System.currentTimeMillis();

                int words = processor.process(doc);

                long end = System.currentTimeMillis();
                long duration = end - start;

                String threadName = Thread.currentThread().getName();

                System.out.println("[" + threadName + "] selesai memproses " +
                        doc + " (" + words + " kata).");

                resultMap.put(doc, new Result(threadName, duration, words));
                latch.countDown();
            });
        }

        latch.await(); 
        executor.shutdown();


        System.out.println("\n==============================================================");
        System.out.println("                     HASIL PEMROSESAN DOKUMEN");
        System.out.println("==============================================================");
        System.out.printf("| %-18s | %-15s | %-10s | %-12s |\n",
                "Nama Dokumen", "Thread", "Durasi", "Jumlah Kata");
        System.out.println("--------------------------------------------------------------");

        long totalWords = 0;
        long totalTime = 0;

        for (Map.Entry<String, Result> entry : resultMap.entrySet()) {
            Result r = entry.getValue();

            System.out.printf("| %-18s | %-15s | %-10d | %-12d |\n",
                    entry.getKey(), r.threadName, r.duration, r.words);

            totalWords += r.words;
            totalTime += r.duration;
        }

        System.out.println("==============================================================");
        System.out.println("Total Kata Keseluruhan : " + totalWords);
        System.out.println("Rata-rata Waktu Proses : " + (totalTime / resultMap.size()) + " ms");
        System.out.println("==============================================================");
    }
}