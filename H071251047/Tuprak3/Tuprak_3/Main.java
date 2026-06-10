public class Main {
    public static void main(String[] args) {
        DompetDigital dompet = new DompetDigital("Ningen", "johndoe@gmail.com", "123456");

        System.out.println("=== Info Akun ===");
        System.out.println("Nama: " + dompet.getName());
        System.out.println("Saldo: " + dompet.getSaldo());

        System.out.println("\n=== Ubah PIN (PIN lama salah) ===");
        dompet.setPINBaru("654321", "000000");

        System.out.println("\n=== Ubah PIN (benar) ===");
        dompet.setPINBaru("654321", "123456");

        System.out.println("\n=== Setor Tunai (valid) ===");
        dompet.setor(500000, "123456");

        System.out.println("\n=== Setor Tunai (negatif) ===");
        dompet.setor(-50000, "123456");

        System.out.println("\n=== Tarik Tunai (PIN lama) ===");
        dompet.tarik(100000, "123456");

        System.out.println("\n=== Tarik Tunai (PIN benar) ===");
        dompet.tarik(100000, "654321");

        System.out.println("\n=== Saldo Akhir ===");
        System.out.println("Saldo: " + dompet.getSaldo());

        dompet.setPINBaru("12345678", "654321");

        // Buku buku1 = new Buku("Java Dasar", false);
        // Buku buku2 = new Buku("Struktur Data", false);

        // Perpustakaan p1 = new Perpustakaan("Perpus A", 15, buku1);
        // Perpustakaan p2 = new Perpustakaan("Perpus B", 8, buku2);

        System.out.println();

        Live live1 = new Live();
        live1.setNama("Abdi");
        live1.setNim(123456);
        live1.setIpk(4);
        live1.tampilkanData();
        
    }
}
