package soal1;

public class Gudang  {
    int stok;
    int kapasitasMaksimal;

    public Gudang(int kapasitasMaksimal) {
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.stok = 0;
    }

    public synchronized void tambahStok(int jumlah) {
        while (stok + jumlah > kapasitasMaksimal) {
            System.out.println("Stok gudang sedang penuh, menunggu untuk menambah stok...");
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        stok += jumlah;
        System.out.println("Stok barang bertambah: "+ jumlah + " | kapasitas sekarang: "+ stok);
        notifyAll();
    }

    public synchronized void ambilStok(int jumlah) {
        while (stok < jumlah) {
            System.out.println("Stok gudang tidak cukup, tunggu dulu kurir treadh");
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        stok -= jumlah;
        System.out.println("Stok barang berkurang: "+ jumlah + " | kapasitas sekarang: "+ stok);
        notifyAll();
    }
}
