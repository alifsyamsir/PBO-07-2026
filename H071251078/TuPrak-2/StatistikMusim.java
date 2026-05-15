public class StatistikMusim {
    int gol;
    int assist;
    int penampilanTotal;
    double ratingAverage;

    public StatistikMusim() {
        this.gol = 0;
        this.assist = 0;
        this.penampilanTotal = 0;
        this.ratingAverage = 0.0;
    }

    public StatistikMusim(int gol, int assist, int penampilan, double rating) {
        this.gol = gol;
        this.assist = assist;
        this.penampilanTotal = penampilan;
        this.ratingAverage = rating;
    }

    public int kontribusiGol() {
        return gol + assist;
    }

    public String ringkasanStatistik() {
        return "Gol: " + gol + " | Assist: " + assist + " | Penampilan: " + penampilanTotal + " | Rating: " + ratingAverage;
    }
}
