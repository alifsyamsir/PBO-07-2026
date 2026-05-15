package TuPrak5.Soal2;

public class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara {

    public SmartSpeaker(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    public void cekFungsi() {
        System.out.println(merk + ": Speaker siap memutar audio.");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println(merk + ": Terhubung ke WiFi, siap streaming.");
    }

    @Override
    public void prosesPerintah(String perintah) {
        System.out.println(merk + " menerima perintah: \"" + perintah + "\"");
    }
}