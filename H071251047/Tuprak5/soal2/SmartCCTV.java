package soal2;

public class SmartCCTV extends PerangkatElektronik implements InteraksiInternet {

    public SmartCCTV(String merek, int dayaListrik) {
        super(merek, dayaListrik);
    }

    @Override
    public void cekFungsiBede() {
        System.out.println(merek + " Bagus ji twwa");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println(merek + " Mengirim data ke server");
    }
}
