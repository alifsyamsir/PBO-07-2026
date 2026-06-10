package soal1;

import java.util.Scanner;
class persegi {
    protected double sisi;
    persegi(){}
    persegi(double sisi) {
        this.sisi = sisi;
    }

    void luas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }

    void keliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }

    void tampilkan(){
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║         PERSEGI         ║");
        System.out.println(  "╚═════════════════════════╝");
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi: ");
        double sisi = x.nextDouble();
        persegi k = new persegi(sisi);
        k.luas();
        k.keliling();
    }
}

class persegi_panjang{
    protected double panjang;
    protected double lebar;
    persegi_panjang(){}
    persegi_panjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void luas(){
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }

    void keliling(){
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }

    void tampilkan(){
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║     PERSEGI PANJANG     ║");
        System.out.println(  "╚═════════════════════════╝");
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        double sisi = x.nextDouble();
        System.out.print("Masukkan lebar   : ");
        double lebar = x.nextDouble();
        persegi_panjang k = new persegi_panjang(sisi, lebar);
        k.luas();
        k.keliling();
    }
}

class lingkaran{
    protected double jari_jari;
    lingkaran(){}
    lingkaran(double jari_jari){
        this.jari_jari = jari_jari;
    }

    void luas(){
        double luas = Math.PI * jari_jari * jari_jari;
        System.out.println("Luas Lingkaran: " + luas);
    }

    void keliling(){
        double keliling = 2 * Math.PI * jari_jari;
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    void tampilkan(){
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║       LINGKARAN         ║");
        System.out.println(  "╚═════════════════════════╝");
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        double sisi = x.nextDouble();
        lingkaran k = new lingkaran(sisi);
        k.luas();
        k.keliling();
    }
}

class trapesium {
    protected double sisi1;
    protected double sisi2;
    protected double sisi3;
    protected double sisi4;
    protected double tinggi;
    trapesium(){}
    trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        this.tinggi = tinggi;
    }

    void luas(){
        double luas = 0.5 * (sisi1 + sisi2) * tinggi;
        System.out.println("Luas Trapesium: " + luas);
    }

    void keliling(){
        double keliling = sisi1 + sisi2 + sisi3 + sisi4;
        System.out.println("Keliling Trapesium: " + keliling);
    }

    void tampilkan(){
        System.out.println("\n╔═════════════════════════╗");
        System.out.println(  "║       TRAPESIUM         ║");
        System.out.println(  "╚═════════════════════════╝");
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan sisi atas   : ");
        double sisi1 = x.nextDouble();
        System.out.print("Masukkan sisi bawah  : ");
        double sisi2 = x.nextDouble();
        System.out.print("Masukkan sisi samping 1 : ");
        double sisi3 = x.nextDouble();
        System.out.print("Masukkan sisi samping 2 : ");
        double sisi4 = x.nextDouble();
        System.out.print("Masukkan tinggi      : ");
        double tinggi = x.nextDouble();
        trapesium k = new trapesium(sisi1, sisi2, sisi3, sisi4, tinggi);
        k.luas();
        k.keliling();
    }
}