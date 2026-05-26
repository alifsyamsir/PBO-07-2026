package Praktikum5.No2;

interface InteraksiInternet {
    void hubungkanWiFi();
    
} 
class SmartCCTV extends PerangkatElektronik implements InteraksiInternet {
    SmartCCTV(String merk, double dayaListrik) {
        super(merk, dayaListrik);
    }

    public String cekFungsi() {
        return merk + " adalah Smart CCTV";
    }
    public void hubungkanWiFi() {
        System.out.println("Mengirim data ke server...");
    }
}
