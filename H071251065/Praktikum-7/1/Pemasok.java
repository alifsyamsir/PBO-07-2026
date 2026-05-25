import java.util.Random;

class Pemasok implements Runnable {
    Gudang gudang;
    Random random = new Random();

    Pemasok(Gudang gudang) {
        this.gudang = gudang;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            int jumlah = random.nextInt(30) + 1;
            gudang.tambahStok(jumlah);
            try {
                Thread.sleep(
                    (random.nextInt(2) + 1) * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
