import java.util.Scanner;
public class tp1_1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Masukkan Judul Film: ");
    String judul= in.nextLine();

    judul= judul.toLowerCase();
    String[] kata = judul.split(" ");
    int jumlahKata = kata.length;

    for (int i=0; i < jumlahKata; i++ ) {
        String awal= kata[i].substring(0, 1).toUpperCase();
        String akhir= kata[i].substring(1);
        String gabung = awal+akhir;
        System.out.print(gabung + " ");
    }

}
    }   
