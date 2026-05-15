package TuPrak4.Soal1;

class BangunRuang {
    double luas;
    double volume;

    void hitungLuas() {
    }

    void hitungVolume() {
    }
}

class Kubus extends BangunRuang {
    double sisi;

    void hitungLuas() {
        luas = 6 * sisi * sisi;
    }

    void hitungVolume() {
        volume = sisi * sisi * sisi;
    }
}

class Balok extends BangunRuang {
    double panjang;
    double lebar;
    double tinggi;

    void hitungLuas() {
        luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    void hitungVolume() {
        volume = panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    double jariJari;

    void hitungLuas() {
        luas = 4 * 3.14 * jariJari * jariJari;
    }

    void hitungVolume() {
        volume = (4.0 / 3) * 3.14 * jariJari * jariJari * jariJari;
    }
}

class Tabung extends BangunRuang {
    double jariJari;
    double tinggi;

    void hitungLuas() {
        luas = 2 * 3.14 * jariJari * (jariJari + tinggi);
    }

    void hitungVolume() {
        volume = 3.14 * jariJari * jariJari * tinggi;
    }
}

class BangunDatar {
    double luas;
    double keliling;

    void hitungLuas() {
    }

    void hitungKeliling() {
    }
}

class Persegi extends BangunDatar {
    double sisi;

    void hitungLuas() {
        luas = sisi * sisi;
    }

    void hitungKeliling() {
        keliling = 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    void hitungLuas() {
        luas = panjang * lebar;
    }

    void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;

    void hitungLuas() {
        luas = 3.14 * jariJari * jariJari;
    }

    void hitungKeliling() {
        keliling = 2 * 3.14 * jariJari;
    }
}

class Trapesium extends BangunDatar {
    double sisi1;
    double sisi2;
    double sisi3;
    double sisi4;
    double tinggi;

    void hitungLuas() {
        luas = 0.5 * (sisi1 + sisi2) * tinggi;
    }

    void hitungKeliling() {
        keliling = sisi1 + sisi2 + sisi3 + sisi4;
    }
}