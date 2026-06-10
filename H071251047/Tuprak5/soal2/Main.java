package soal2;

public class Main {
    public static void main(String[] args) {
        SmartCCTV cctv = new SmartCCTV("Pannasonic", 30);
        cctv.cekFungsiBede();
        cctv.hubungkanWiFi();
        cctv.infoPower();

        System.out.println("=============================================");

        SmartLamp lamp = new SmartLamp("Philips", 15);
        lamp.cekFungsiBede();
        lamp.prosesPerintah("nyala");
        lamp.infoPower();

        System.out.println("=============================================");
        
        SmartSpeaker speaker = new SmartSpeaker("Sony", 40);
        speaker.cekFungsiBede();
        speaker.infoPower();
        speaker.hubungkanWiFi();
        speaker.prosesPerintah("NYALA");
        System.out.println("=============================================");
    }
}
