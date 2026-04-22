public class soal2 {
    String nama;
    String NIM;
    private double IPK;

    public soal2( String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        if (IPK >= 0.0 && IPK <= 4.0) {
            this.IPK = IPK;
        } else {
            System.out.println("IPK HARUS ANTARA 0.0 SAMPAI 4.0");
        }
    }

    public double getIPK() {
        return IPK;

    }

    public void tampilkandata (){
        System.out.println("nama" + this.nama);
        System.out.println("nim" + this.IPK);
        System.out.println("IPK" + IPK);
    }
}