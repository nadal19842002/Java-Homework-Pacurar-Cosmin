package e_03_08;

import java.util.Comparator;

public class PersonComparatorByName implements Comparator<Persoana> {

    @Override
    public int compare( Persoana persoana1, Persoana persoana2){
        return persoana1.getName().compareTo(persoana2.getName());
    }

}
