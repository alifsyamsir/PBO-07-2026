class Dimensi {
    double luas;
}

class BangunRuang extends Dimensi {
    double volume;
}

class Kubus extends BangunRuang {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }
    void hitung() {
        luas   = 6 * sisi * sisi;
        volume = sisi * sisi * sisi;
    }
}

class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar   = lebar;
        this.tinggi  = tinggi;
    }

    void hitung() {
        luas   = 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi);
        volume = panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    double jari;

    Bola(double jari) {
        this.jari = jari;
    }

    void hitung() {
        luas   = 4 * Math.PI * jari * jari;
        volume = (4.0/3) * Math.PI * jari * jari * jari;
    }
}

class Tabung extends BangunRuang {
    double jari, tinggi;

    Tabung(double jari, double tinggi) {
        this.jari   = jari;
        this.tinggi = tinggi;
    }

    void hitung() {
        luas   = 2 * Math.PI * jari * (jari + tinggi);
        volume = Math.PI * jari * jari * tinggi;
    }
}

class BangunDatar extends Dimensi {
    double keliling;
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    void hitung() {
        luas     = sisi * sisi;
        keliling = 4 * sisi;
    }
}
class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar   = lebar;
    }

    void hitung() {
        luas     = panjang * lebar;
        keliling = 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    double jari;

    Lingkaran(double jari) {
        this.jari = jari;
    }

    void hitung() {
        luas     = Math.PI * jari * jari;
        keliling = 2 * Math.PI * jari;
    }
}

class Trapesium extends BangunDatar {
    double sisi1, sisi2, sisi3, sisi4, tinggi;

    Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1  = sisi1;
        this.sisi2  = sisi2;
        this.sisi3  = sisi3;
        this.sisi4  = sisi4;
        this.tinggi = tinggi;
    }

    void hitung() {
        luas     = 0.5* (sisi1 + sisi2) * tinggi;
        keliling = sisi1 + sisi2 + sisi3 + sisi4;
    }
}
