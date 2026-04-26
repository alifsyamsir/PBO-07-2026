package TuPrak4.Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("  ===== BANGUN RUANG =====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println();
        System.out.println("  ===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        System.out.println("----------------------------------------");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        System.out.println("----------------------------------------");

        if (pilihan == 1) {
            Kubus k = new Kubus();
            System.out.print("Masukkan sisi kubus: ");
            k.sisi = scanner.nextDouble();
            k.hitungLuas();
            k.hitungVolume();
            System.out.println("Luas kubus: " + k.luas);
            System.out.println("Volume kubus: " + k.volume);

        } else if (pilihan == 2) {
            Balok b = new Balok();
            System.out.print("Masukkan panjang balok: ");
            b.panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar balok: ");
            b.lebar = scanner.nextDouble();
            System.out.print("Masukkan tinggi balok: ");
            b.tinggi = scanner.nextDouble();
            b.hitungLuas();
            b.hitungVolume();
            System.out.println("Luas balok: " + b.luas);
            System.out.println("Volume balok: " + b.volume);

        } else if (pilihan == 3) {
            Bola bo = new Bola();
            System.out.print("Masukkan jari-jari bola: ");
            bo.jariJari = scanner.nextDouble();
            bo.hitungLuas();
            bo.hitungVolume();
            System.out.println("Luas bola: " + bo.luas);
            System.out.println("Volume bola: " + bo.volume);

        } else if (pilihan == 4) {
            Tabung t = new Tabung();
            System.out.print("Masukkan jari-jari tabung: ");
            t.jariJari = scanner.nextDouble();
            System.out.print("Masukkan tinggi tabung: ");
            t.tinggi = scanner.nextDouble();
            t.hitungLuas();
            t.hitungVolume();
            System.out.println("Luas tabung: " + t.luas);
            System.out.println("Volume tabung: " + t.volume);

        } else if (pilihan == 5) {
            Persegi p = new Persegi();
            System.out.print("Masukkan sisi persegi: ");
            p.sisi = scanner.nextDouble();
            p.hitungLuas();
            p.hitungKeliling();
            System.out.println("Luas persegi: " + p.luas);
            System.out.println("Keliling persegi: " + p.keliling);

        } else if (pilihan == 6) {
            PersegiPanjang pp = new PersegiPanjang();
            System.out.print("Masukkan panjang: ");
            pp.panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar: ");
            pp.lebar = scanner.nextDouble();
            pp.hitungLuas();
            pp.hitungKeliling();
            System.out.println("Luas persegi panjang: " + pp.luas);
            System.out.println("Keliling persegi panjang: " + pp.keliling);

        } else if (pilihan == 7) {
            Lingkaran l = new Lingkaran();
            System.out.print("Masukkan jari-jari lingkaran: ");
            l.jariJari = scanner.nextDouble();
            l.hitungLuas();
            l.hitungKeliling();
            System.out.println("Luas lingkaran: " + l.luas);
            System.out.println("Keliling lingkaran: " + l.keliling);

        } else if (pilihan == 8) {
            Trapesium tr = new Trapesium();
            System.out.print("Masukkan sisi 1 trapesium: ");
            tr.sisi1 = scanner.nextDouble();
            System.out.print("Masukkan sisi 2 trapesium: ");
            tr.sisi2 = scanner.nextDouble();
            System.out.print("Masukkan sisi 3 trapesium: ");
            tr.sisi3 = scanner.nextDouble();
            System.out.print("Masukkan sisi 4 trapesium: ");
            tr.sisi4 = scanner.nextDouble();
            System.out.print("Masukkan tinggi trapesium: ");
            tr.tinggi = scanner.nextDouble();
            tr.hitungLuas();
            tr.hitungKeliling();
            System.out.println("Luas trapesium: " + tr.luas);
            System.out.println("Keliling trapesium: " + tr.keliling);

        } else {
            System.out.println("Eror, Tidak Valid");
        }

        System.out.println("----------------------------------------");
    }
}