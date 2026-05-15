package Num02;

abstract class PerangkatElektronik {
    protected String merk;
    protected int dayaListrik;
 
    public PerangkatElektronik(String merk, int dayaListrik) {
        this.merk = merk;
        this.dayaListrik = dayaListrik;
    }

    public void infoPower() {
        System.out.println( merk + " menyedot daya sebesar " + dayaListrik + " Watt.");
    }

    public abstract void cekFungsi();
}