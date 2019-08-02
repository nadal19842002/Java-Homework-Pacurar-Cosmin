package e_03_08;

import java.util.*;

public class HashMapExample {

    public static void main (String[] a){
        List<String> hobbies = new ArrayList<>();
        hobbies.add("calarie");
        hobbies.add("fotbal");
        hobbies.add("tenis");
        hobbies.add("politica");
        hobbies.add("stiinte");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Pacurar Cosmin","fotbal");
        hashMap.put("Zgherea Gheorghe","stiinte");
        hashMap.put("Tanase George","tenis");
        hashMap.put("Pacurar Cristina","stiinte");
        hashMap.put("Iliescu Vasile","fotbal");
        hashMap.put("Curca Vasile","fotbal");
       Set<String> keys = hashMap.keySet();
       for(String key:keys){
           System.out.println(key);
           String numePersoane = hashMap.get(key);
           Collection<String> hobbiuri = hashMap.values();
           System.out.println();
       }
        }





    }

