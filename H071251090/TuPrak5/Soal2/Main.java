package TuPrak5.Soal2;

public class Main {
    public static void main(String[] args) {

        SmartLamp lamp = new SmartLamp("Philips", 10);
        SmartCCTV cctv = new SmartCCTV("Hikvision", 15);
        SmartSpeaker speaker = new SmartSpeaker("JBL", 25);

        System.out.println("=== Smart Lamp ===");
        lamp.cekFungsi();
        lamp.infoPower();
        lamp.prosesPerintah("NYALA");

        System.out.println("\n=== Smart CCTV ===");
        cctv.cekFungsi();
        cctv.infoPower();
        cctv.hubungkanWiFi();

        System.out.println("\n=== Smart Speaker ===");
        speaker.cekFungsi();
        speaker.infoPower();
        speaker.hubungkanWiFi();
        speaker.prosesPerintah("Play");
    }
}