package Num02;

class SmartCCTV extends PerangkatElektronik implements InteraksiInternet {
 
    public SmartCCTV(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    public void cekFungsi() {
        System.out.println("[SmartCCTV - " + merk + "] Fungsi: Kamera pengawas dengan koneksi internet.");
    }

    public void hubungkanWiFi() {
        System.out.println("Mengirim data ke server...");
    }
}