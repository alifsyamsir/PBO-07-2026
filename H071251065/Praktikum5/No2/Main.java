package Praktikum5.No2;

public class Main {
    public static void main(String[] args) {

        //smart lamp
        SmartLamp lamp = new SmartLamp("merk1", 10);
        System.out.println("=== Smart Lamp ===");
        System.out.println(lamp.cekFungsi());
        lamp.infoPower();                       
        lamp.prosesPerintah("NYALA");            

        System.out.println();

        //SmartCCTV 
        SmartCCTV cctv = new SmartCCTV("merk2", 15);
        System.out.println("=== Smart CCTV ===");
        System.out.println(cctv.cekFungsi());
        cctv.infoPower();                       
        cctv.hubungkanWiFi();                   

        System.out.println();

        //Smart speaker 
        SmartSpeaker speaker = new SmartSpeaker("merk3", 20);
        System.out.println("=== Smart Speaker ===");
        System.out.println(speaker.cekFungsi()); 
        speaker.infoPower();                     
        speaker.hubungkanWiFi();                 
        speaker.prosesPerintah("PLAY");    
    }
}
    
