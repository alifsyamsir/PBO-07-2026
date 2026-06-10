package soal2;

public class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, PerintahSuara{

    public SmartSpeaker(String merek, int dayaListrik) {
        super(merek, dayaListrik);
    }

    @Override
    public void cekFungsiBede() {
        System.out.println(merek + " barang bagus ini bro mwehehe");
        
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println("Status: " + merek + " konek ke server");
        
    }

    @Override
    public void prosesPerintah(String perintah) {
        System.out.println("Perintah suara: " + merek + " bersuara abangkuh!!");
        
    }
    
    
}
