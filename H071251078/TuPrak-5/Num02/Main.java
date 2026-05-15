package Num02;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SMART LAMP ===");
        SmartLamp lamp = new SmartLamp("Philips", 10);
        lamp.cekFungsi();
        lamp.infoPower();
        lamp.prosesPerintah("NYALA");

        System.out.println("\n=== SMART CCTV ===");
        SmartCCTV cctv = new SmartCCTV("Xiaomi", 15);
        cctv.cekFungsi();
        cctv.infoPower();
        cctv.hubungkanWiFi();

        System.out.println("\n=== SMART SPEAKER ===");
        SmartSpeaker speaker = new SmartSpeaker("JBL", 25);
        speaker.cekFungsi();
        speaker.infoPower();
        speaker.hubungkanWiFi();
        speaker.prosesPerintah("Putar musik - Bukan Pujangga");
    }
}