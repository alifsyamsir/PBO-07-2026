package Praktikum5.No2;

abstract class PerangkatElektronik {
    String merk;
    double dayaListrik;

    PerangkatElektronik(String merk, double dayaListrik){
        this.merk= merk;
        this.dayaListrik =dayaListrik;

    }
    abstract String cekFungsi();

    void infoPower() {
        System.out.println(merk + " sedang menyedot daya sebesar " + dayaListrik + " Watt");
    }

}
