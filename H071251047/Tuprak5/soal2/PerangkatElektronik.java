package soal2;

abstract class PerangkatElektronik {
    public String merek;
    public int dayaListrik;

    public PerangkatElektronik(String merek, int dayaListrik) {
        this.merek = merek;
        this.dayaListrik = dayaListrik;
    }

    public abstract void cekFungsiBede();

    public void infoPower() {
        System.out.println(merek + " memakai daya listrik: " + dayaListrik + " watt");
    }
}

// public class PerangkatElektronik {
//     public String merek;
//     public int dayaListrik;

//     public PerangkatElektronik(String merek, int dayaListrik) {
//         this.merek = merek;
//         this.dayaListrik = dayaListrik;
//     }

//     public void tampilkanInfo() {
//         System.out.println("Merek\t\t: " + merek);
//         System.out.println("Daya Listrik\t: " + dayaListrik + " watt");
//     }
// }