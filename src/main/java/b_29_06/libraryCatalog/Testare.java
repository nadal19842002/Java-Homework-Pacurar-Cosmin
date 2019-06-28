package b_29_06.libraryCatalog;

public class Testare {
    public static void main(String[] args) {
        // TODO Auto-generated metho
        Nuvele nuvela = new Nuvele("Neamul Soimarestilor");
        nuvela.adaugaCarti("Ion");
        nuvela.adaugaCarti("Cel mai iubit dintre pamanteni");
        nuvela.adaugaCarti("Halkidiki");

        AlbumeArta albume = new AlbumeArta("Picasso");
        albume.adaugaCarti("Rembrandt");
        albume.adaugaCarti("Hagi");
        albume.adaugaCarti("Caracuda");

        albume.stergeCarti("Picasso");
    }
}
