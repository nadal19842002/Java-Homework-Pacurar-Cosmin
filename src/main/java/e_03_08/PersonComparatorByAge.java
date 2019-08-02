package e_03_08;

import java.util.Comparator;

public class PersonComparatorByAge implements Comparator<Persoana> {


    @Override
    public int compare( Persoana persoana1, Persoana persoana2){
        if(persoana1.getAge()<persoana2.getAge()){
        return -1;
        }
        else if (persoana1.getAge()==persoana2.getAge()){
        return 0;
        }
        else
            return 1;

    }

}
