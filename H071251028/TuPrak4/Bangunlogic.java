class Bangun { }

//bangun ruang
class Kubus extends Bangun {
    double sisi;

    Kubus(double sisi) { this.sisi = sisi; } 

    double volume() { return sisi * sisi * sisi; } //rumus volume kubus adalah sisi^3
    double luasPermukaan() { return 6 * sisi * sisi; }
}

class Balok extends Bangun {
    double p, l, t;

    Balok(double p, double l, double t) { //constructor untuk menginisialisasi atribut panjang, lebar, dan tinggi
        this.p = p; this.l = l; this.t = t;
    }

    double volume() { return p * l * t; }
    double luasPermukaan() { return 2 * (p*l + p*t + l*t); }
}

class Bola extends Bangun {
    double r;

    Bola(double r) { this.r = r; }

    double volume() { return (4.0/3.0) * Math.PI * r * r * r; } //rumus volume bola adalah (4/3) * π * r^3
    double luasPermukaan() { return 4 * Math.PI * r * r; }
}

class Tabung extends Bangun {
    double r, t;

    Tabung(double r, double t) { //constructor untuk menginisialisasi atribut jari-jari dan tinggi
        this.r = r; this.t = t;
    }

    double volume() { return Math.PI * r * r * t; }
    double luasPermukaan() { return 2 * Math.PI * r * (r + t); }
}


// bangun datar
class Persegi extends Bangun {
    double sisi;

    Persegi(double sisi) { this.sisi = sisi; } 

    double luas() { return sisi * sisi; } //rumus luas persegi adalah sisi^2
    double keliling() { return 4 * sisi; }
}

class PersegiPanjang extends Bangun {
    double p, l;

    PersegiPanjang(double p, double l) {
        this.p = p; this.l = l;
    }

    double luas() { return p * l; }
    double keliling() { return 2 * (p + l); } //rumus keliling persegi panjang adalah 2 * (panjang + lebar)
}

class Lingkaran extends Bangun {
    double r;

    Lingkaran(double r) { this.r = r; }

    double luas() { return Math.PI * r * r; } //rumus luas lingkaran adalah π * r^2
    double keliling() { return 2 * Math.PI * r; }
}

class Trapesium extends Bangun {
    double a, b, c, d, t;

    Trapesium(double a, double b, double c, double d, double t) { 
        this.a = a; this.b = b; this.c = c; this.d = d; this.t = t;
    }

    double luas() { return 0.5 * (a + b) * t; } //rumus luas trapesium adalah 0.5 * (sisi sejajar 1 + sisi sejajar 2) * tinggi
    double keliling() { return a + b + c + d; }
}