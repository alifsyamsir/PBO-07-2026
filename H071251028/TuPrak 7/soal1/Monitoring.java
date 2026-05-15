package soal1;

public class Monitoring implements Runnable {
    private final Gudang gudang;
    private volatile boolean berjalan = true;

    public Monitoring(Gudang gudang) {
        this.gudang = gudang;
    }

    public void stopMonitoring() {
        berjalan = false;
    }

    @Override
    public void run() {
        try {
            while (berjalan) {
                int stok = gudang.getStok();
                int max = gudang.getKapasitasMaksimal();
                int persen = (stok * 100) / max;

                int blocks = persen / 10;
                StringBuilder bar = new StringBuilder("[");
                for (int i = 0; i < 10; i++) {
                    bar.append(i < blocks ? "#" : "-");
                }
                bar.append("] ");

                System.out.println("Status Gudang: " + bar + persen + "%");

                Thread.sleep(1000);
            }
        } catch (InterruptedException ignored) {}
    }
}