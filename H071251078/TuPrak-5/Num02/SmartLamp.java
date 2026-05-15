package Num02;

class SmartLamp extends PerangkatElektronik implements KontrolSuara {
 
    public SmartLamp(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    public void cekFungsi() {
        System.out.println("[SmartLamp - " + merk + "] Fungsi: Lampu pintar dengan kontrol suara.");
    }

    public void prosesPerintah(String perintah) {
        if (perintah.equalsIgnoreCase("NYALA")) {
            System.out.println("Lampu berpijar!");
        } else {
            System.out.println("Perintah tidak dikenali.");
        }
    }
}