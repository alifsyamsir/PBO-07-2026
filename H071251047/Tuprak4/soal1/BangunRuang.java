package soal1;

import java.util.Scanner;
class kubus extends persegi {
    kubus() {}
    kubus(double sisi) {
        super(sisi);
    }

    void volume() {
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus: " + volume);
    }

    void luas_permukaan() {
        double luas_permukaan = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus: " + luas_permukaan);
    }

    void tampilkan() {
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║         KUBUS           ║");
        System.out.println(  "╚═════════════════════════╝");
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        double sisi = x.nextDouble();
        kubus k = new kubus(sisi);
        k.volume();
        k.luas_permukaan();
    }
}

class balok extends persegi_panjang {
    protected double tinggi;
    balok() {}
    balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    void volume() {
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok: " + volume);
    }

    void luas_permukaan() {
        double luas_permukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        System.out.println("Luas Permukaan Balok: " + luas_permukaan);
    }

    void tampilkan() {
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║         BALOK           ║");
        System.out.println(  "╚═════════════════════════╝");
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        double panjang = x.nextDouble();
        System.out.print("Masukkan lebar   : ");
        double lebar = x.nextDouble();
        System.out.print("Masukkan tinggi  : ");
        double tinggi = x.nextDouble();
        balok b = new balok(panjang, lebar, tinggi);
        b.volume();
        b.luas_permukaan();
    }
}

class bola extends lingkaran {
    bola() {}
    bola(double jari_jari) {
        super(jari_jari);
    }

    void volume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jari_jari, 3);
        System.out.printf("Volume Bola: %.2f\n", volume);
    }

    void luas_permukaan() {
        double luas_permukaan = 4 * Math.PI * Math.pow(jari_jari, 2);
        System.out.printf("Luas Permukaan Bola: %.2f\n", luas_permukaan);
    }

    void tampilkan() {
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║         BOLA            ║");
        System.out.println(  "╚═════════════════════════╝");
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola: ");
        double jari_jari = x.nextDouble();
        bola b = new bola(jari_jari);
        b.volume();
        b.luas_permukaan();
    }
}

class tabung extends lingkaran {
    protected double tinggi;
    tabung() {}
    tabung(double jari_jari, double tinggi) {
        super(jari_jari);
        this.tinggi = tinggi;
    }

    void volume() {
        double volume = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        System.out.println("Volume Tabung: " + volume);
    }

    void luas_permukaan() {
        double luas_permukaan = 2 * Math.PI * jari_jari * (jari_jari + tinggi);
        System.out.println("Luas Permukaan Tabung: " + luas_permukaan);
    }

    void tampilkan() {
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║         TABUNG          ║");
        System.out.println(  "╚═════════════════════════╝");
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        double jari_jari = x.nextDouble();
        System.out.print("Masukkan tinggi tabung   : ");
        double tinggi = x.nextDouble();
        tabung t = new tabung(jari_jari, tinggi);
        t.volume();
        t.luas_permukaan();
    }
}

class dekorasi {
    void DEKORASI(){
        System.out.println("╔══════════════════════════╗══════════════════════════╗");
        System.out.println("║       BANGUN DATAR       ║       BANGUN RUANG       ║");
        System.out.println("╠══════════════════════════╣══════════════════════════╣");
        System.out.println("║  1. Persegi              ║  5. Kubus                ║");
        System.out.println("║  2. Persegi Panjang      ║  6. Balok                ║");
        System.out.println("║  3. lingkaran            ║  7. Bola                 ║");
        System.out.println("║  4. trapesium            ║  8. tabung               ║");
        System.out.println("╠══════════════════════════╚══════════════════════════╣");
        System.out.println("║  0. Exit                                            ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
        System.out.print("Masukkan pilihan bangun datar(1-8) (0 untuk exit): ");
    }
}