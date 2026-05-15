package TuPrak3.Soal1;

class DompetDigital {
    private double saldo;
    private String pin;
    protected String idNasabah;
    String statusAkun;

    public DompetDigital(String pinAwal, String idNasabah, String statusAkun) {
        this.saldo = 0;
        this.pin = pinAwal;
        this.idNasabah = idNasabah;
        this.statusAkun = "Aktif";
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIdNasabah() {
        return idNasabah;
    }

    public String getStatusAkun() {
        return statusAkun;
    }

    public void setPin(String pinLama, String pinBaru) {
        if(!pin.equals(pinLama)) {
            System.out.println("i - Pin Lama Salah");
            catatLog("Ganti Pin Gagal");
        } else if (pinBaru.length() != 6) {
            System.out.println("i - Pin Harus 6 Karakter");
            catatLog("Ganti Pin Gagal");
        } else {
            this.pin = pinBaru;
            System.out.println("i - Pin Berhasil di Perbarui");
            catatLog("Ganti Pin Sukses");
        }
    }

    public void setorTunai(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("i - Jumlah Tidak Valid");
            catatLog("Setor Tunai Gagal");
        } else {
            saldo += jumlah;
            System.out.println("i - Setor Tunai Berhasil | Sejumlah Rp." + jumlah + ", Saldo Saat Ini Rp." + saldo);
            catatLog("Setor Tunai Sukses");
        }
    }

    public void tarikTunai(double jumlah, String pinInput) {
        if (!pin.equals(pinInput)) {
            System.out.println("i - Pin Salah");
            catatLog("Tarik Tunai Gagal");
        } else if (jumlah > saldo) {
            System.out.println("i - Saldo Tidak Cukup");
            catatLog("Tarik Tunai Gagal");
        } else {
            saldo -= jumlah;
            System.out.println("i - Tarik Tunai Berhasil | Sejumlah Rp." + jumlah + ", Sisa Saldo Rp." + saldo);
            catatLog("Tarik Tunai Sukses");
        }
    }

    private void catatLog(String pesan) {
        System.out.println("[LOG] " + pesan);
    }
}