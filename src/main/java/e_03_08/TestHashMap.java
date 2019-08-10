package e_03_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] a){
        Person person1 = new Person("Pacurar Cosmin");
        Person person2 = new Person("Pacurar Cristina");
        Person person3 = new Person("Cazac Ilie");
        Person person4 = new Person("Johnny Deep");
        Person person5 = new Person("Pacurar Matei");

        Adress adress1 = new Adress("Romania");
        Adress adress2 = new Adress("Israel");
        Adress adress3 = new Adress("Franta");
        Adress adress4 = new Adress("Anglia");

        ArrayList<Hobby> hobbies1 = new ArrayList<>();
        ArrayList<Hobby> hobbies2 = new ArrayList<>();
        ArrayList<Hobby> hobbies3 = new ArrayList<>();
        ArrayList<Hobby> hobbies4 = new ArrayList<>();

        hobbies1.add(new Hobby(" fotbal,tenis,chimie,psihologie",adress1));
        hobbies2.add(new Hobby(" literatura, nutritie, sport",adress2));
        hobbies3.add(new Hobby(" shopping, bungee-jumping",adress3));
        hobbies4.add(new Hobby(" pictura,arte martiale,alergari",adress4));

        HashMap<Person,ArrayList<Hobby>> hashMap = new HashMap<>();
        hashMap.put(person1,hobbies1);
        hashMap.put(person2,hobbies3);
        hashMap.put(person3,hobbies2);
        hashMap.put(person4,hobbies4);

        for(Map.Entry<Person,ArrayList<Hobby>> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }



    }
}
