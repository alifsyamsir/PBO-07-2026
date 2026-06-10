package soal1;

import java.util.Random;

class Kurir implements Runnable {
    Gudang gudang;
    Random random = new Random();

    public Kurir(Gudang gudang) {
        this.gudang = gudang;
    }

    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()){
            try {
                int jumlah = random.nextInt(4)+1;
                gudang.ambilStok(jumlah);

                Thread.sleep((random.nextInt(2)+2)*1000);
            } catch (InterruptedException e){
                System.out.println("Kurir berhenti.");
                break;
            }
        }
    }    
}
