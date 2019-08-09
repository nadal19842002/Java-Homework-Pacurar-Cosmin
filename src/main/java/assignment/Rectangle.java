package assignment;

public class Rectangle implements Shape {
    private double rectangleLenght;
    private double rectangleWidth;

    public Rectangle(double rectangleLenght, double rectangleWidth){
        this.rectangleLenght = rectangleLenght;
        this.rectangleWidth = rectangleWidth;
    }

    public double getRectangleLenght(){
        return rectangleLenght;
    }

    public void setRectangleLenght(double rectangleLenght){
        this.rectangleLenght = rectangleLenght;
    }

    public double getRectangleWidth(){
        return rectangleWidth;
    }

    public void setRectangleWidth(double rectangleWidth){
        this.rectangleWidth = rectangleWidth;
    }

    @Override
    public double getArea(){
        double v = rectangleLenght * rectangleWidth;
        return v;
    }
    @Override
    public double getPerimeter(){
        double x = 2*(rectangleLenght + rectangleWidth);
        return x;
    }
    @Override
    public String toString(){
        return "Dreptunghiul are aria"+getArea()+" si perimetrul "+getPerimeter();
    }

}
