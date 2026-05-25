package Praktikum5;

abstract class Karyawan{
    private String nama, idKaryawan;
    private int jumlahKehadiran;

    Karyawan(String nama, String idKaryawan){
        this.nama= nama;
        this.idKaryawan = idKaryawan;
    }
    void absen(){
        jumlahKehadiran++;
    }
    String getNama() { 
        return nama; 
    }
    String getIdKaryawan() { 
        return idKaryawan; 
    }
    int getJumlahKehadiran() { 
        return jumlahKehadiran; 
    }

    abstract double hitungGaji();
}
