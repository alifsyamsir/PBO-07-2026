package TuPrak3.Soal1;

class Main {
    public static void main(String[] args) {
        
        DompetDigital dompetku = new DompetDigital("123456", "User001", "Aktif");

        System.out.println("=== INFORMASI AKUN ===");
        System.out.println("ID Nasabah: " + dompetku.getIdNasabah() + " |  Status Akun: " + dompetku.getStatusAkun());
        System.out.println(" ");

        System.out.println("=== UBAH PIN ===");
        dompetku.setPin("000000", "654321");
        dompetku.setPin("123456", "654321");
        System.out.println(" ");

        System.out.println("=== SETOR TUNAI ===");
        dompetku.setorTunai(500000);
        dompetku.setorTunai(-100000);
        System.out.println(" ");

        System.out.println("=== TARIK TUNAI ===");
        dompetku.tarikTunai(100000, "000000");
        dompetku.tarikTunai(100000, "654321");
        System.out.println(" ");

        System.out.println("=== SALDO AKHIR ===");
        System.out.println("Saldo Akhir: Rp. " + dompetku.getSaldo());
    }
}