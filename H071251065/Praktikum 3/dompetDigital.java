class dompetDigital {
    private String password;
    private int saldo;
    protected String user;
    String riwayatTransaksi;

    public dompetDigital(String password, String user) {
        this.password = password;
        this.saldo = 0;
        this.user = user;
        this.riwayatTransaksi = "";
    }
    public String getUser() {
        return user;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getRiwayatTransaksi() {
        return riwayatTransaksi;
    }

    public void setPassword(String passwordLama, String newPassword) {
        if (!passwordLama.equals(this.password)) {
            System.out.println("Gagal! password lama salah");
            return;
        }

        if (newPassword.length() < 6) {
            System.out.println("Gagal! password baru minimal 6 karakter");
            return;
        }

        this.password = newPassword;
        System.out.println("Password berhasil diubah");
    }

    public void setorTunai(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Setor gagal! jumlah tidak valid");
            catatRiwayat("[Gagal menyetor saldo]: Rp" + jumlah );
        } else {
            saldo += jumlah;
            System.out.println("Setor berhasil: RP" + jumlah);
            System.out.println("Saldo saat ini: Rp" + saldo);
            catatRiwayat("Jumlah Setoran: Rp" + jumlah);
        }
    }

    public void tarikTunai(String passwordInput, int jumlah) {
        if (!passwordInput.equals(this.password)) {
            System.out.println("Menarik gagal! password salah");
            catatRiwayat("[Gagal menarik saldo]: password salah");
            return;
        }

        if (jumlah > saldo) {
            System.out.println("Menarik gagal: saldo tidak cukup");
            catatRiwayat("[Gagal menarik saldo]: saldo tidak cukup");
            return;
        }

        saldo -= jumlah;
        System.out.println("Menarik berhasil: Rp" + jumlah);
        System.out.println("Saldo saat ini: Rp" + saldo);
        catatRiwayat("Menarik saldo sebesar: Rp" + jumlah);
    }

    private void catatRiwayat(String keterangan) {
        riwayatTransaksi += keterangan + "\n";
    }
}
