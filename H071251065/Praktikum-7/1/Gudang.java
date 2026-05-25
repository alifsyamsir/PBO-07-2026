class Gudang {
    int stok, kapasitasMaksimal;

    Gudang(int kapasitasMaksimal) {
        this.kapasitasMaksimal = kapasitasMaksimal;
    }

    synchronized void tambahStok(int jumlah){
        while (stok + jumlah > kapasitasMaksimal) {
            try {
                System.out.println("Gudang penuh, pemasok menunggu...");
                wait(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        stok += jumlah;
        System.out.println("Stok ditambahkan: " + jumlah + ", Stok saat ini: " + stok);
        notifyAll(); 
    }
    synchronized void ambilStok(int jumlah){
        while (stok < jumlah) {
            try {
                System.out.println("Stok tidak mencukupi, kurir menunggu...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        stok -= jumlah;
        System.out.println("Stok diambil: " + jumlah + ", Stok saat ini: " + stok);
        notifyAll(); 
    }
}
