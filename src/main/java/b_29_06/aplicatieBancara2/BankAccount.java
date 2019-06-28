package b_29_06.aplicatieBancara2;

import java.util.ArrayList;

public class BankAccount {
    private ArrayList<String> attachedBankAccount;
    private double sumaDinCont;
    private ArrayList<String> attachedCardNumbers;
    private String contBancar;
    private String nrCard;
    public double getSumaDinCont() {
        return sumaDinCont;
    }

    public void setSumaDinCont(double sumaDinCont) {
        this.sumaDinCont = sumaDinCont;
    }

    public String getContBancar() {
        return contBancar;
    }

    public void setContBancar(String contBancar) {
        this.contBancar = contBancar;
    }

    public String getNrCard() {
        return nrCard;
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
    }

    public double adaugaInCont(double bagaBani) {
        sumaDinCont = sumaDinCont + bagaBani;
        return sumaDinCont;
    }

    public void scoateBanidinCont(double scoateBani) {
        if (scoateBani > sumaDinCont) {
            System.out.println("Nu ai suficienti bani in cont!Introdu o suma mai mica");
        } else {
            System.out.println("Felicitari!Ai platit suma de " + scoateBani);
        }
    }
    public void attachCard(){
        ArrayList<String> cardAtasat = new ArrayList<>(5);
        cardAtasat.add(0,"125689");
        cardAtasat.add(1,"128754");
        cardAtasat.add(0,"127844");
        cardAtasat.add(0,"123344");

    }
}

