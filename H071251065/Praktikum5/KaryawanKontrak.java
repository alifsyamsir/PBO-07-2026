package Praktikum5;

public class KaryawanKontrak extends Karyawan {
    double upahPerHari;

    KaryawanKontrak(String nama, String idKaryawan, double upahPerHari){
    super(nama, idKaryawan) ;
    this.upahPerHari= upahPerHari;
    }
    
    @Override
    double hitungGaji() {
    double totalGaji = upahPerHari * getJumlahKehadiran(); 
    if (getJumlahKehadiran() > 20) {
        totalGaji += 500000; 
    }
    return totalGaji; 
}
         
    }
   
