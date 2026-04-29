package soal2;

abstract class PerangkatElektronik {
    protected String merk; //ini atribut bede
    protected int dayaListrik;

    public PerangkatElektronik(String merk, int dayaListrik) {
        this.merk = merk;
        this.dayaListrik = dayaListrik;
    }

    public abstract void cekFungsi(); //buat class anaq nya cek fungsinya sendiri

    public void infoPower() {
        System.out.println(merk + " menyedot daya " + dayaListrik + " Watt.");
    }
}