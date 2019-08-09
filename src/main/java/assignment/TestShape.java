package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class TestShape {

    double perimetru;
    double aria;
    ArrayList<Double> perimetre = new ArrayList<>();
    ArrayList<Double> arii = new ArrayList<>();
    ArrayList<Shape> forme = new ArrayList<>();

    public static void main(String[] args) {
        TestShape testShape = new TestShape();

        Circle c = new Circle(15);
        //testShape.addShape(c);
        System.out.println("Perimetrul cercului este:" + c.getPerimeter());
        System.out.println("Aria cercului este:" + (c.getArea()));

        Circle c1 = new Circle(64);
        //testShape.addShape(c1);
        System.out.println("Perimetrul cercului este:" + c1.getPerimeter());
        System.out.println("Aria cercului este:" + c1.getArea());

        Triangle t = new Triangle(3, 4, 5,8 );
        //testShape.addShape(t);
        System.out.println("Perimetrul triunghiului este:" + t.getPerimeter());
        System.out.println("Aria triunghiului este:" + t.getArea());

        Rectangle r = new Rectangle(3, 4);
        //testShape.addShape(r);
        System.out.println("Perimetrul dreptunghiului este:" + r.getPerimeter());
        System.out.println("Aria dreptunghiului este:" + r.getArea());

        Square s = new Square(4);
        //testShape.addShape(s);
        System.out.println("Perimetrul patratului este:" + s.getPerimeter());
        System.out.println("Aria patratului este:" + s.getArea());

        Square s1 = new Square(4);
        System.out.println("Exista un duplicat:"+(s1.equals(s)));
        //testShape.c;


        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c);
        shapes.add(c1);
        shapes.add(t);
        shapes.add(r);
        shapes.add(s);
        shapes.add(s1);
        for (Shape shape:shapes) {
            if (shapes.contains(shapes)){
                System.out.println("Atentie!Ai adaugat o forma similara cu cea din lista");
            }
        }
    }

    public void calculeaza() {
        for (Shape shape : forme) {
            this.perimetru = shape.getPerimeter();
            perimetre.add(perimetru);
            this.aria = shape.getArea();
            arii.add(aria);
        }
        double sum = 0;
        for (Double d : perimetre)
            sum += d;
        System.out.println("Suma perimetrelor figurilor geometrice este:" + (sum));
        double sum2 = 0;
        for (Double d1 : arii)
            sum2 += d1;
        System.out.println("Suma ariilor figurilor geometrice este:" + (sum2));
    }





}

















