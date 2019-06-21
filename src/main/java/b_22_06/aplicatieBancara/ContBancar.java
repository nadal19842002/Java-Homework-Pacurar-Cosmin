package b_22_06.aplicatieBancara;
import java.util.*;
public class ContBancar {
    //pasul 1. stabilim proprietatile sau atributele unui cont bancar
    private String contIBAN;
    private ArrayList<String> conturiAtasate;
    private String titularCont;
    private String numarCard;
    private String numarCardAtasat;
    private double baniInContulAtasat;
    private double baniInContuldeBaza;
    /*pasul 2. folosim o metoda(constructor special) pentru a construi obiectul cu proprietatile
de mai sus*/
    public ContBancar (String cont,String titular,String numarCard, double baniInCont,double baniInContulAtasat) {
        this.contIBAN = cont;
        this.titularCont = titular;
        this.numarCard = numarCard;
        this.baniInContuldeBaza =baniInCont;
        this.baniInContulAtasat = baniInContulAtasat;}

    public void bagaBaniInCont(double bagaBani) {
        this.baniInContuldeBaza = this.baniInContuldeBaza + bagaBani;
    }
    public void scoateBaniDinCont(double scoateBani) {
        this.baniInContuldeBaza = this.baniInContuldeBaza -scoateBani;
    }
    public double baniiDinCont(double baniInCont, double bagaBani, double scoateBani) {
        double baniiDinCont = baniInCont + bagaBani-scoateBani;
        return baniiDinCont;
    }
    public void ataseazaCard(String numarCardAtasat) {
        ArrayList<String> conturiAtasate = new ArrayList<String>(5);
        conturiAtasate.add(numarCardAtasat);
    }
    public void platesteCuCardulAtasat (double scoateBani) {
        if(scoateBani>baniInContuldeBaza)
            System.out.println("Plateste cu cardurile atasate: ");
        if(scoateBani<baniInContulAtasat)
            System.out.println("Felicitari!Ai platit cu banii din cardurile atasate!"+
                    " Mai ai disponibil in contul atasat "+(baniInContulAtasat - scoateBani));

    }
}
