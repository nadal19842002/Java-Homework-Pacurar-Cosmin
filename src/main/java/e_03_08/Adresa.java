package e_03_08;

public class Adresa {
    private String[] adresa;

public Adresa(String [] adresa){
    this.adresa = adresa;
}

    public String[] getAdresa() {
        return adresa;
    }

    public void setAdresa(String[] adresa) {
        this.adresa = adresa;
    }
    @Override
    public String toString(){
    return "Adress is "+adresa;
    }
}
