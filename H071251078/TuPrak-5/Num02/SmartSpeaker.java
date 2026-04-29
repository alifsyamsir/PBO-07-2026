package Num02;

class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara {
 
    public SmartSpeaker(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    public void cekFungsi() {
        System.out.println("[SmartSpeaker - " + merk + "] Fungsi: Speaker pintar dengan WiFi dan kontrol suara.");
    }

    public void hubungkanWiFi() {
        System.out.println("Terhubung ke WiFi.");
    }

    public void prosesPerintah(String perintah) {
        System.out.println("Memproses perintah: " + perintah);
        System.out.println("Perintah dijalankan.");
    }
}