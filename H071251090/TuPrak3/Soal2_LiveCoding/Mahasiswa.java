package TuPrak3.Soal2_LiveCoding;

public class Mahasiswa {
    String nama;
    String nim;
    private double ipk;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    public double getIpk() {
        return ipk;
    }
    
    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("tidak valid, hanya boleh 0.0 - 4.0");
        }
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }
}