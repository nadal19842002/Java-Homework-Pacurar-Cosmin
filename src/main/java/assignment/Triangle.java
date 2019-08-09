package assignment;

public class Triangle implements Shape {
    private double length1;
    private double length2;
    private double length3;
    private double triangleHeight;

    public Triangle(double length1, double length2, double length3, double triangleHeight){
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        this.triangleHeight = triangleHeight;
    }

    public double getLength1(){
        return length1;
    }

   public void setLength1(double length1){
        this.length1 = length1;
   }

    public double getLength2(){
        return length2;
    }

    public void setLength2(double length2){
        this.length2 = length2;
    }

    public double getLength3(){
        return length3;
    }

    public void setLength3(double length3){
        this.length3 = length3;
    }

    @Override
    public double getArea(){
        double f = (length1 * triangleHeight)/2.0;
        return f;
    }
    @Override
    public double getPerimeter(){
        double g = length1 + length2 + length3;
        return g;
    }
    public String toString(){
        return "Triunghiul are aria"+getArea()+" si perimetrul "+getPerimeter();
    }





}
