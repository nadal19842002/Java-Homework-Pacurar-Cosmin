package e_03_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Hobby {
    private String hobbyName;
    private int frequence;
    private Adress adress;

    public Hobby(String hobbyName,Adress adress ){
        this.hobbyName=hobbyName ;
        this.adress = adress;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Hobby"+ hobbyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return hobbyName.equals(hobby.hobbyName) &&
                adress.equals(hobby.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hobbyName, adress);
    }
}
