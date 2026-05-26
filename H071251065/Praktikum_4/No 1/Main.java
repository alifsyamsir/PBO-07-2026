import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("------------------------------------------");
            System.out.println("      ===== BANGUN RUANG =====");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG");
            System.out.println();
            System.out.println("      ===== BANGUN DATAR =====");
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. TRAPESIUM");
            System.out.println("0. KELUAR");
            System.out.println("------------------------------------------");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            System.out.println("------------------------------------------");

            switch (pilihan) {
                case 1: {
                    System.out.print("Masukkan sisi kubus: ");
                    double s = input.nextDouble();
                    Kubus k  = new Kubus(s);
                    k.hitung();
                    System.out.println("Luas kubus: "   + k.luas);
                    System.out.println("Volume kubus: " + k.volume);
                    break;
                }
                case 2: {
                    System.out.print("Masukkan panjang balok: ");
                    double p = input.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double l = input.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double t = input.nextDouble();
                    Balok b  = new Balok(p, l, t);
                    b.hitung();
                    System.out.println("Luas balok: "   + b.luas);
                    System.out.println("Volume balok: " + b.volume);
                    break;
                }
                case 3: {
                    System.out.print("Masukkan jari-jari bola: ");
                    double r = input.nextDouble();
                    Bola bo  = new Bola(r);
                    bo.hitung();
                    System.out.println("Luas bola: "   + bo.luas);
                    System.out.println("Volume bola: " + bo.volume);
                    break;
                }
                case 4: {
                    System.out.print("Masukkan jari-jari tabung: ");
                    double r = input.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double t = input.nextDouble();
                    Tabung tb = new Tabung(r, t);
                    tb.hitung();
                    System.out.println("Luas tabung: "   + tb.luas);
                    System.out.println("Volume tabung: " + tb.volume);
                    break;
                }
                case 5: {
                    System.out.print("Masukkan sisi persegi: ");
                    double s  = input.nextDouble();
                    Persegi ps = new Persegi(s);
                    ps.hitung();
                    System.out.println("Luas persegi: "     + ps.luas);
                    System.out.println("Keliling persegi: " + ps.keliling);
                    break;
                }
                case 6: {
                    System.out.print("Masukkan panjang: ");
                    double p   = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double l   = input.nextDouble();
                    PersegiPanjang pp = new PersegiPanjang(p, l);
                    pp.hitung();
                    System.out.println("Luas persegi panjang: "     + pp.luas);
                    System.out.println("Keliling persegi panjang: " + pp.keliling);
                    break;
                }
                case 7: {
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double r    = input.nextDouble();
                    Lingkaran lg = new Lingkaran(r);
                    lg.hitung();
                    System.out.println("Luas lingkaran: "     + lg.luas);
                    System.out.println("Keliling lingkaran: " + lg.keliling);
                    break;
                }
                case 8: {
                    System.out.print("Masukkan sisi 1 trapesium: ");
                    double s1 = input.nextDouble();
                    System.out.print("Masukkan sisi 2 trapesium: ");
                    double s2 = input.nextDouble();
                    System.out.print("Masukkan sisi 3 trapesium: ");
                    double s3 = input.nextDouble();
                    System.out.print("Masukkan sisi 4 trapesium: ");
                    double s4 = input.nextDouble();
                    System.out.print("Masukkan tinggi trapesium: ");
                    double t  = input.nextDouble();
                    Trapesium tr = new Trapesium(s1, s2, s3, s4, t);
                    tr.hitung();
                    System.out.println("Luas trapesium: "     + tr.luas);
                    System.out.println("Keliling trapesium: " + tr.keliling);
                    break;
                }
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println("------------------------------------------");

        } while (pilihan != 0);

        input.close();
    }
}
