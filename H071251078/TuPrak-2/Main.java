public class Main {
    public static void main(String[] args) {

        StatistikMusim statSesko = new StatistikMusim(9, 1, 27, 7.2 );
        StatistikMusim statFernandes = new StatistikMusim(8, 17, 28, 8.5);
        StatistikMusim statMbeumo  = new StatistikMusim(9, 3, 26, 7.8);

        Kontrak kontrakSesko = new Kontrak("Aktif", 2, 160.0);
        Kontrak kontrakFernandes = new Kontrak("Aktif", 1, 280.0);
        Kontrak kontrakMbeumo  = new Kontrak("Aktif", 3, 150.0);

        PemainMU sesko = new PemainMU("Benjamin Sesko", "Forward", 30, "Slovenia", statSesko, kontrakSesko);
        PemainMU fernandes = new PemainMU("Bruno Fernandes", "Midfielder", 8, "Portugal", statFernandes, kontrakFernandes);
        PemainMU mbeumo  = new PemainMU("Bryan Mbeumo", "Forward", 19, "Kamerun", statMbeumo, kontrakMbeumo);

        sesko.tampilkanProfil();
        fernandes.tampilkanProfil();
        mbeumo.tampilkanProfil();

        sesko.bandingkanDengan(fernandes);
        sesko.bandingkanDengan(mbeumo);
        fernandes.bandingkanDengan(mbeumo);
        
        sesko.evaluasiKontrak();
        fernandes.evaluasiKontrak();
        mbeumo.evaluasiKontrak();
    }
}
