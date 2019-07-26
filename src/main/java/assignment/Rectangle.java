package assignment;

public class Rectangle implements Shape {
    private double lungime;
    private double latime;

    public Rectangle(double lungime,double latime){
        this.lungime = lungime;
        this.latime = latime;
    }

    public double getLungime(){
        return lungime;
    }

    public void setLungime(double lungime){
        this.lungime = lungime;
    }

    public double getLatime(){
        return latime;
    }

    public void setLatime(double latime){
        this.latime = latime;
    }

    @Override
    public double getArea(){
        double v = lungime * latime;
        return v;
    }
    @Override
    public double getPerimeter(){
        double x = 2*(lungime + latime);
        return x;
    }
    @Override
    public String toString(){
        return "Dreptunghiul are aria"+getArea()+" si perimetrul "+getPerimeter();
    }

}
