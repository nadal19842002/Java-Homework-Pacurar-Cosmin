package e_03_08;

import java.util.List;

public class Hobby {
    private String hobby;
    private int frequence;
    private List<Adresa> adresa;

public Hobby(String hobby, int frequence, List<Adresa> adresa){
    this.hobby = hobby;
    this.frequence = frequence;
    this.adresa = adresa;
}

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getFrequence() {
        return frequence;
    }

    public void setFrequence(int frequence) {
        this.frequence = frequence;
    }

    public List<Adresa> getAdresa() {
        return adresa;
    }

    public void setAdresa(List<Adresa> adresa) {
        this.adresa = adresa;
    }
    @Override
    public String toString(){
    return "His hobby is" + hobby +", he is practicing "+frequence +" times per week, and he can practice at "
            + adresa;
    }
}
