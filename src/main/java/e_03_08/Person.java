package e_03_08;

public class Person {
    private String name;

public Person(String name){
this.name = name;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
    return "Name of the person is" + name;
    }
}
