import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Gudang gudang = new Gudang(100);

        ExecutorService executor = Executors.newFixedThreadPool(6);
            executor.execute(new Pemasok(gudang));
            executor.execute(new Pemasok(gudang));
            executor.execute(new Kurir(gudang));
            executor.execute(new Kurir(gudang));
            executor.execute(new Kurir(gudang));
            executor.execute(new Monitoring(gudang));

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                    System.out.println("Beberapa thread masih berjalan...");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            executor.shutdownNow();
            
        }
}
}