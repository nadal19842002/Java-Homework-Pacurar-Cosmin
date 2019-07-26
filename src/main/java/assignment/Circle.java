package assignment;

public class Circle implements Shape {
    private double radius;

    Circle(float radius){
        this.radius=radius;
    }

   public double getRadius(){
        return radius;
   }

   public void setRadius(double radius){
        this.radius = radius;
   }

   @Override
    public double getArea(){
        double c = Math.PI*radius*radius;
        return c;
    }
    @Override
    public double getPerimeter(){
    double d = 2*Math.PI*radius;
    return d;
    }
    @Override
    public String toString(){
        return "Cercul are aria"+getArea()+" si perimetrul "+getPerimeter();
    }

}





