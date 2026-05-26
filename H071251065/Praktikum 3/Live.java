class Mahasiswa{
    String nama;
    String nim;
    private double ipk;

    public Mahasiswa(String nama, String nim){
        this.nama =nama;
        this.nim= nim;
    }
    public double getIpk(){
        return ipk;

    }
      public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("ipk tidak valid");
        }
    }
    public void tampilkanData(){
        System.out.println("Informasi");
        System.out.println("nama: "+ nama);
        System.out.println("nim: "+ nim);
        System.out.println("ipk: "+ ipk);
    
}
} 

public class Live {
    public static void main(String[] args) {
        Mahasiswa mahasiswa= new Mahasiswa("Zahwa","00");

        mahasiswa.setIpk(5);
        mahasiswa.tampilkanData();
    }

}
