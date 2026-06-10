
public class Live {
    private String nama;
    private int nim;
    
    private int ipk;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getNim() {
        return nim;
    }
    public void setNim(int  nim) {
        this.nim = nim;
    }
    
    public void setIpk(int ipk) {
        this.ipk = ipk;
    }
    
    // public void tampilkanData(){
    //     System.out.println("nama\t: " + this.nama);
    //     System.out.println("nim\t: " + this.nim);
    //     System.out.println("ipk\t: " + this.ipk);
    // }

    public void tampilkanData(String nama, int nim, int ipk){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
}
