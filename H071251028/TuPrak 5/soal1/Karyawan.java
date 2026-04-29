package soal1;

abstract class Karyawan {
    private String nama; //atribut nya
    private String idKaryawan;
    private int jumlahKehadiran;

    public Karyawan(String nama, String idKaryawan) {  //constructor-nya
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.jumlahKehadiran = 0;
    }

    public void absen() { //Method hanya melakukan tindakan, tapi nd nakasi beng hasil langsungna
        jumlahKehadiran++;
    }

    public int getJumlahKehadiran() {
        return jumlahKehadiran;
    }

    public String getNama() {
        return nama;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public abstract double hitungGaji();
}