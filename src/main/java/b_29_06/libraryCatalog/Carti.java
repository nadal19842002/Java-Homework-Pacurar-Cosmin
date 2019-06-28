package b_29_06.libraryCatalog;
import java.util.ArrayList;

public class Carti {
    public String nume;
    public int nrPagini;
    private String tipHartie;
    private String tip;

    public Carti (String nume) {
        this.nume = nume;
    }

    ArrayList<String> array = new ArrayList<String>(5);

    public void adaugaCarti (String nume) {
        array.add(0,"Neamul Soimarestilor");
        array.add(1,"Ion");
        array.add(2,"Dragnea");
        array.add(3,"Halkidiki");
        array.add(4,"Mizerabilii");
    }

    public String stergeCarti (String nume) {
        return array.remove(0);
        //return array.remove(1);


    }

    }


