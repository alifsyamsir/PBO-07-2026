package soal1;

import java.util.Random;

class Pemasok implements Runnable {
    Gudang gudang;
    Random random;

    public Pemasok(Gudang gudang) {
        this.gudang = gudang;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            int jumlah = random.nextInt(5) + 1;
            gudang.tambahStok(jumlah);
            try {
                Thread.sleep((random.nextInt(2) + 1) * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }   
}