public class Main {
    public static void main(String[] args) {
        DompetDigital dompet = new DompetDigital("CORTIS-001", "Martin", "123456");

        System.out.println("--- Informasi Akun ---");
        System.out.println("Nama Nasabah: " + dompet.getNamaNasabah());

        System.out.println("\n--- Pengujian Ubah PIN ---");
        dompet.setPin("000000", "290908"); // PIN lama salah
        dompet.setPin("123456", "290908"); // Berhasil

        System.out.println("\n--- Pengujian Setor Tunai ---");
        dompet.setorTunai(500000); // betul
        dompet.setorTunai(-10000); // salah

        System.out.println("\n--- Pengujian Tarik Tunai ---");
        dompet.tarikTunai(100000, "111111"); // PIN salah
        dompet.tarikTunai(200000, "290908"); // PIN benar

        System.out.println("\n--- Hasil Akhir ---");
        System.out.println("Sisa Saldo Akhir: Rp" + dompet.getSaldo());


        soal2 mhs = new soal2("alim", "H0000000");
        mhs.setIPK( 4.0);
        mhs.tampilkandata();

    }
}