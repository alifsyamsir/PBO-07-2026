package soal2;

public class SmartLamp extends PerangkatElektronik implements PerintahSuara {
    
    public SmartLamp(String merek, int dayaListrik) {
        super(merek, dayaListrik);


    }
    @Override
    public void cekFungsiBede() {
        System.out.println(merek + " berfungsi dengan baik");
    }

    @Override
    public void prosesPerintah(String perintah) {
        if(perintah.equalsIgnoreCase("NYALA")) {
            System.out.println("lampu menyala abngkuh!!");
        }else{
            System.out.println("Lampu tidak berpijar");
        }
    }
}
