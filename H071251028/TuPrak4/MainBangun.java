import java.util.Scanner;

public class MainBangun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== BANGUN RUANG ======");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");

        System.out.println("\n====== BANGUN DATAR ======");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");

        System.out.println("----------------------------------------");
        System.out.print("Pilihan: ");
        int pilih = sc.nextInt();

        System.out.println("----------------------------------------");

        switch(pilih){
            case 1 -> { //untuk kubus, program akan meminta input sisi kubus, kemudian membuat objek Kubus dengan nilai sisi yang dimasukkan, dan akhirnya menampilkan volume dan luas permukaan kubus menggunakan metode volume() dan luasPermukaan() dari kelas Kubus
                System.out.print("Masukkan sisi kubus: ");
                double s = sc.nextDouble();
                Kubus k = new Kubus(s);
                System.out.println("Volume kubus: " + k.volume());
                System.out.println("Luas permukaan kubus: " + k.luasPermukaan());
            }
            case 2 -> {
                System.out.print("Masukkan panjang: ");
                double p = sc.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = sc.nextDouble();
                Balok b = new Balok(p,l,t);
                System.out.println("Volume balok: " + b.volume());
                System.out.println("Luas permukaan balok: " + b.luasPermukaan());
            }
            case 3 -> {
                System.out.print("Masukkan jari-jari bola: ");
                double r = sc.nextDouble();
                Bola bo = new Bola(r);
                System.out.println("Volume bola: " + bo.volume());
                System.out.println("Luas permukaan bola: " + bo.luasPermukaan());
            }
            case 4 -> {
                System.out.print("Masukkan jari-jari tabung: ");
                double r = sc.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double t = sc.nextDouble();
                Tabung tb = new Tabung(r,t);
                System.out.println("Volume tabung: " + tb.volume());
                System.out.println("Luas permukaan tabung: " + tb.luasPermukaan());
            }

            // ======= BANGUN DATAR ========
            case 5 -> {
                System.out.print("Masukkan sisi persegi: ");
                double s = sc.nextDouble();
                Persegi pe = new Persegi(s);
                System.out.println("Luas persegi: " + pe.luas());
                System.out.println("Keliling persegi: " + pe.keliling());
            }
            case 6 -> {
                System.out.print("Masukkan panjang: ");
                double p = sc.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = sc.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(p,l);
                System.out.println("Luas persegi panjang: " + pp.luas());
                System.out.println("Keliling persegi panjang: " + pp.keliling());
            }
            case 7 -> {
                System.out.print("Masukkan jari-jari lingkaran: ");
                double r = sc.nextDouble();
                Lingkaran li = new Lingkaran(r);
                System.out.println("Luas lingkaran: " + li.luas());
                System.out.println("Keliling lingkaran: " + li.keliling());
            }
            case 8 -> {
                System.out.print("Masukkan sisi 1 trapesium: ");
                double a = sc.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                double b = sc.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: ");
                double c = sc.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: ");
                double d = sc.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double t = sc.nextDouble();

                Trapesium tr = new Trapesium(a,b,c,d,t);

                System.out.println("Luas trapesium: " + tr.luas());
                System.out.println("Keliling trapesium: " + tr.keliling());
            }
            default -> System.out.println("Pilihan tidak valid!");
        }

    }
}