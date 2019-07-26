package assignment;

public class Triangle implements Shape {
    private double lungime1;
    private double lungime2;
    private double lungime3;
    private double inaltimeaTriunghiului;

    public Triangle(double lungime1, double lungime2,double lungime3,double inaltimeaTriunghiului){
        this.lungime1=lungime1;
        this.lungime2=lungime2;
        this.lungime3=lungime3;
        this.inaltimeaTriunghiului=inaltimeaTriunghiului;
    }

    public double getLungime1(){
        return lungime1;
    }

   public void setLungime1(double lungime1){
        this.lungime1 = lungime1;
   }

    public double getLungime2(){
        return lungime2;
    }

    public void setLungime2(double lungime2){
        this.lungime2 = lungime2;
    }

    public double getLungime3(){
        return lungime3;
    }

    public void setLungime3(double lungime3){
        this.lungime3 = lungime3;
    }

    @Override
    public double getArea(){
        double f = (lungime1*inaltimeaTriunghiului)/2.0;
        return f;
    }
    @Override
    public double getPerimeter(){
        double g = lungime1+lungime2+lungime3;
        return g;
    }
    public String toString(){
        return "Triunghiul are aria"+getArea()+" si perimetrul "+getPerimeter();
    }





}
