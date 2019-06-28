package b_29_06.aplicatieBancara2;

public class Card {
    private String nume;
    private int dataExpirare;
    protected String numarCard;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(int dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public String getNumarCard() {
        return numarCard;
    }

    public void setNumarCard(String numarCard) {
        this.numarCard = numarCard;
    }
}

