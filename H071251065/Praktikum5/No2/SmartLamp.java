package Praktikum5.No2;

interface KontrolSuara {
    void prosesPerintah(String perintah);
    

} 
class SmartLamp extends PerangkatElektronik implements KontrolSuara {
    SmartLamp(String merk, double dayaListrik) {
        super(merk, dayaListrik);
    }

    public String cekFungsi() {
        return merk + " adalah Smart Lamp";
    }

    public void prosesPerintah(String perintah) {
        if (perintah.equals("NYALA")) {
            System.out.println("Lampu berpijar!");
        }
}
}
