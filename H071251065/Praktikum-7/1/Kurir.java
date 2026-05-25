import java.util.Random;

class Kurir implements Runnable {
    Gudang gudang;
    Random random = new Random();

    Kurir(Gudang gudang) {
        this.gudang = gudang;
    }

    @Override
    public void run() { 
        while (!Thread.currentThread().isInterrupted()) {
            int jumlah = random.nextInt(20) + 1;
            gudang.ambilStok(jumlah);
            try {
                Thread.sleep((random.nextInt(2) + 2) * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
