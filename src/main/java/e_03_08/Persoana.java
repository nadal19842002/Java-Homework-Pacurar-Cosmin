package e_03_08;

public class Persoana {
    private String name;
    private int age;

    public Persoana(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
     return "Name " + name + " , and age is "+ age;
    }
}



