class Monitoring implements Runnable {
    Gudang gudang;

    Monitoring(Gudang gudang) {
        this.gudang = gudang;
    }

    synchronized String getStatus() {
        int stok = gudang.stok;
        int persentase = (stok * 100) / gudang.kapasitasMaksimal;
        int panjangBar = 20;
        int terisiBar = (stok*panjangBar) / gudang.kapasitasMaksimal;
        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < panjangBar; i++) {
            if (i < terisiBar) {
                bar.append("#");
            } else {
                bar.append("-");
            }
        }
        return "Status Gudang: [" + bar.toString() + "]"  + persentase + "%";
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(getStatus());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
