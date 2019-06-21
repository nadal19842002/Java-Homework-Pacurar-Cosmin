package b_22_06.aplicatieBancara;

public class TestareAplicatieBancara {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        User user1 = new User("Pacurar Cosmin","1267");
        user1.adaugaCard(2024, "12600", "Pacurar Cosmin");
        user1.adaugaCard(2028, "12601", "Pacurar Cosmin");
        user1.adaugaCard(2080,"13600", "Pacurar Cosmin");

        pOS pos1 = new pOS(13600,2600);
        pos1.platesteCuCardulDeBaza(13600.25, 2600.35);
        pos1.platesteCuCardulDeBaza(2600.35, 4600.35);
        pos1.cardExpirat(2015);
        pos1.contBancarNecunoscut("1268", "1269");
    }
}
