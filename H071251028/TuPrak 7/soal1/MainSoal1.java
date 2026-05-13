package soal1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainSoal1 {
    public static void main(String[] args) throws InterruptedException { 

        Gudang gudang = new Gudang(20); 

        ExecutorService executor = Executors.newFixedThreadPool(5);

        executor.execute(new Pemasok(gudang));
        executor.execute(new Pemasok(gudang));

        executor.execute(new Kurir(gudang));
        executor.execute(new Kurir(gudang));
        executor.execute(new Kurir(gudang));

        Monitoring monitor = new Monitoring(gudang);
        Thread monitorThread = new Thread(monitor);
        monitorThread.start();

        Thread.sleep(15000);

        executor.shutdownNow();
        monitor.stopMonitoring();
        monitorThread.interrupt();

        executor.awaitTermination(3, TimeUnit.SECONDS);

        System.out.println("Program selesai");
    }
}