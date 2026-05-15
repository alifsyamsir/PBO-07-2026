public class DompetDigital {
    private double saldo;
    private String pin;
 
    protected String namaNasabah;

    String idNasabah;

    // Constructor public
    public DompetDigital(String idNasabah, String namaNasabah, String pinAwal) {
        this.idNasabah = idNasabah;
        this.namaNasabah = namaNasabah;
        this.pin = pinAwal;
        this.saldo = 0; // Saldo akun baru otomatis 0 
    }


    public String getNamaNasabah() {
        return namaNasabah;
    }

    public double getSaldo() {
        return saldo;
    } 

    public void setPin(String pinLama, String pinBaru) {
        if (this.pin.equals(pinLama) && pinBaru.length() == 6) { 
            this.pin = pinBaru; 
            System.out.println("[Sistem] PIN berhasil diperbarui.");
            catatLog("Ubah PIN Berhasil"); 
        } else {
            System.out.println("[Sistem] GAGAL: PIN lama salah atau PIN baru tidak 6 digit!");
            catatLog("Ubah PIN Gagal");
        }
    }

    
    public void setorTunai(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("[Sistem] Berhasil setor: Rp" + jumlah);
            catatLog("Setor Tunai Berhasil");
        } else {
            System.out.println("[Sistem] GAGAL: Nominal tidak valid!");
        }
    }
 
    public void tarikTunai(double jumlah, String inputPin) { 
        if (!this.pin.equals(inputPin)) { 
            System.out.println("[Sistem] GAGAL: PIN salah!");
            catatLog("Tarik Tunai Gagal (PIN Salah)");
        } else if (jumlah > saldo) { 
            System.out.println("[Sistem] GAGAL: Saldo tidak mencukupi!");
            catatLog("Tarik Tunai Gagal (Saldo Kurang)");
        } else {
            this.saldo -= jumlah; 
            System.out.println("[Sistem] Berhasil tarik: Rp" + jumlah);
            catatLog("Tarik Tunai Berhasil");
        }
    }
   
    
    private void catatLog(String aktivitas) { 
        System.out.println(">> Log Internal: " + aktivitas);
    }
}