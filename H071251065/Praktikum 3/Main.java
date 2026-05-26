public class Main {
    public static void main(String[] args) {

        dompetDigital dompet = new dompetDigital("tdktau00000", "Zahwa");

        System.out.println("[INFORMASI AKUN]");
        System.out.println("User: " + dompet.getUser());
        System.out.println("Saldo: " + dompet.getSaldo());

        System.out.println("\n[UBAH PASSWORD]");
        System.out.println("[Tidak Valid]");
        dompet.setPassword("salah", "baru123");
        System.out.println("[Valid]");
        dompet.setPassword("tdktau00000", "baru123");

        System.out.println("\n[SETOR TUNAI]");
        System.out.println("[Valid]");
        dompet.setorTunai(1000000);
        System.out.println("[Tidak Valid]");
        dompet.setorTunai(-1000);

        System.out.println("\n[TARIK TUNAI]");
        System.out.println("[Tidak Valid]");
        dompet.tarikTunai("tdktau00000", 50000);
        System.out.println("[Valid]");
        dompet.tarikTunai("baru123", 5000);

        System.out.println("\n[SALDO AKHIR]");
        System.out.println("Saldo: Rp" + dompet.getSaldo());

        System.out.println("\n[RIWAYAT TRANSAKSI]");
        System.out.println(dompet.getRiwayatTransaksi());
    }
}
