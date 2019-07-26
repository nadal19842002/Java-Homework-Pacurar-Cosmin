package assignment;

public class Square implements Shape {
    private double lungimePatrat;

    public Square(double lungime){
    this.lungimePatrat=lungime;
}

public double getLungime(){
    return lungimePatrat;
}

public void setLungime(double lungime){
    this.lungimePatrat = lungime;
}

@Override
public double getArea(){
    double a = Math.pow(lungimePatrat,2);
        return a;
    }
@Override
    public double getPerimeter(){
        double x = 4*lungimePatrat;
        return x;
}
@Override
public String toString(){
    return "Patratul are aria"+getArea()+" si perimetrul "+getPerimeter();
}








}
