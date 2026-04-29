package soal2;

public class MainSoal2 {
    public static void main(String[] args) {

        SmartLamp lamp = new SmartLamp("Lumina", 10); //objek na ini
        SmartCCTV cctv = new SmartCCTV("SecureCam", 15);
        SmartSpeaker speaker = new SmartSpeaker("VocalX", 50);

        System.out.println("=== SMART LAMP ===");
        lamp.cekFungsi();
        lamp.prosesPerintah("NYALA");
        lamp.infoPower();

        System.out.println("\n=== SMART CCTV ===");
        cctv.cekFungsi();
        cctv.hubungkanWiFi();
        cctv.infoPower();

        System.out.println("\n=== SMART SPEAKER ===");
        speaker.cekFungsi();
        speaker.hubungkanWiFi();
        speaker.prosesPerintah("Play Music");
        speaker.infoPower();
    }
}