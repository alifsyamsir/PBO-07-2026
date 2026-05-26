package Praktikum5.No2;

class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara {
    SmartSpeaker(String merk, double dayaListrik) {
        super(merk, dayaListrik);
    }
    public String cekFungsi() {
        return merk + " adalah Smart Speaker";
    }

    public void hubungkanWiFi() {
        System.out.println(merk + " terhubung ke WiFi");
    }

    public void prosesPerintah(String perintah) {
        System.out.println(merk + " memproses perintah: " + perintah);
    }
}