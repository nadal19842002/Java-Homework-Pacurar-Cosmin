package assignment;

public class Square implements Shape {
    private double squareSize;

    public Square(double lungime){
    this.squareSize =lungime;
}

public double getLungime(){
    return squareSize;
}

public void setLungime(double lungime){
    this.squareSize = lungime;
}

@Override
public double getArea(){
    double a = Math.pow(squareSize,2);
        return a;
    }
@Override
    public double getPerimeter(){
        double x = 4* squareSize;
        return x;
}
@Override
public String toString(){
    return "Patratul are aria"+getArea()+" si perimetrul "+getPerimeter();
}








}
