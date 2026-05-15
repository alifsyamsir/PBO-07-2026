package TuPrak2;

import java.util.Random;

public class KartuPokemon {
    String nama;
    int hp;
    Energi energi;

    public KartuPokemon() {
        this.nama = "Pokemon Gada Nama";
        this.hp = 50;
        this.energi = new Energi("Normal", 10);
    }

    public KartuPokemon(String nama, int hp, Energi energi) {
        this.nama = nama;
        this.hp = hp;
        this.energi = energi;
    }
 
        public void Tanding(KartuPokemon Musuh) {
            Random rand = new Random();
            System.out.println("=== Mulai Battle: " +this.nama+ " VS " +Musuh.nama+ " ===");

            while (this.hp > 0 && Musuh.hp > 0) {
                int demekkemusuh = this.energi.jumlahEnergi + rand.nextInt(10);
                Musuh.hp -= demekkemusuh;
                System.out.println(this.nama +" menyerang, " + Musuh.nama + " menerima "+ demekkemusuh + " damage ");

                if (Musuh.hp <= 0) {
                    //Musuh.hp = 0;
                    System.out.println(Musuh.nama + " KO "+ this.nama + " MENANG");
                    break;
                }

            int demekkekita = Musuh.energi.jumlahEnergi + rand.nextInt(10);
            this.hp -= demekkekita;
            System.out.println(Musuh.nama + " menyerang, "+ this.nama + " menerima " + demekkekita + " damage ");

            if (this.hp <= 0) {
                //this.hp = 0;
                System.out.println(this.nama+ " KO. " + Musuh.nama + " MENANG");
            }

            System.out.println("Sisa HP : " + this.nama + ": " + this.hp + "|" + Musuh.nama + ": " + Musuh.hp);
            System.out.println("------------------------------------------------");
            }
        }

    public void TampilStatus() {
        System.out.println("Pokemon: " + this.nama + " | HP: " + this.hp + " | Tipe: " + this.energi.tipe + " |");
    }
}