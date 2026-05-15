package soal1;

public class MainSoal1 {
    public static void main(String[] args) {

        KaryawanTetap tetap = new KaryawanTetap("martin", "T001", 5000000, 20000);

        tetap.absen();
        tetap.absen();
        tetap.absen();

        tetap.tampilData(750000);

        KaryawanKontrak kontrak = new KaryawanKontrak("mark", "K009", 150000);

        for (int i = 0; i < 22; i++) {
            kontrak.absen();
        }

        kontrak.tampilData();
    }
}