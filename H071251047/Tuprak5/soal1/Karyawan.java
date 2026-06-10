package soal1;

abstract class Karyawan {
    private String nama;
    private String idKaryawan;
    private int jumlahKehadiran;

    public Karyawan(String nama, String idKaryawan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
    }

    public void absen() {
        jumlahKehadiran++;
    }

    public abstract int hitungGaji();

    public int getJumlahKehadiran() {
        return jumlahKehadiran;
    }

    void tampilkanInfo(){
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("ID Karyawan\t\t: " + idKaryawan);
    }

    void halo() {
        System.out.println("saya adlah induk");
    }
}
