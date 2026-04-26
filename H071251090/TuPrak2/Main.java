package TuPrak2;

public class Main {
    public static void main(String[] args) {
        Energi api = new Energi("Api", 25);
        Energi listrik = new Energi("listrik", 20);
        KartuPokemon charizard = new KartuPokemon("Charizard", 100, api);
        KartuPokemon pikachu = new KartuPokemon("Pikachu", 80, listrik);

        charizard.TampilStatus();
        pikachu.TampilStatus();

        charizard.Tanding(pikachu);
    }
}