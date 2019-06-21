package b_22_06.libraryCatalog;
import java.util.ArrayList;
public class Carti {
    public String nume;
    public int nrPagini;
    private String tipHartie;
    private String tip;

    public Carti (String nume) {
        this.nume = nume;

    }

    ArrayList<String> array = new ArrayList<>(5);

    public void adaugaCarti (String nume) {
        array.add(nume);
        array.add(nume);
        array.add(nume);
        array.add(nume);

    }
    public void stergeCarti (String nume) {
        array.remove(0);
        array.remove(1);

    }
    public String toString() {
        return nume;
    }

}
