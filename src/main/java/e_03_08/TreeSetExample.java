package e_03_08;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] a) {
        // comparam persoanele dupa nume
        PersonComparatorByName personComparatorByName = new PersonComparatorByName();
        TreeSet<Persoana> treeSet1 = new TreeSet<Persoana>(personComparatorByName);


        Persoana person1 = new Persoana("Ilie Cazac", 61);
        Persoana person2 = new Persoana("Cosmin Pacurar", 35);
        Persoana person3 = new Persoana("Cristina Pacurar", 26);
        Persoana person4 = new Persoana("Ion Ionescu",48);

       treeSet1.add(person1);
        treeSet1.add(person2);
        treeSet1.add(person3);
        treeSet1.add(person4);

        System.out.println("treeSet : " + treeSet1 + "\n");

        for(Persoana persoana:treeSet1){
            System.out.println("Name : " + persoana.getName());
            System.out.println("Age : " + persoana.getAge());
            System.out.println("------------------------");
        }
        //comparam persoanele dupa varsta
        PersonComparatorByAge personComparatorByAge = new PersonComparatorByAge();
        TreeSet<Persoana> treeSet2 = new TreeSet<Persoana>(personComparatorByAge);
        treeSet2.add(person1);
        treeSet2.add(person2);
        treeSet2.add(person3);
        treeSet2.add(person4);

        for(Persoana persoana:treeSet2){
            System.out.println("Name : " + persoana.getName());
            System.out.println("Age : " + persoana.getAge());
            System.out.println("------------------------");
        }




    }
}