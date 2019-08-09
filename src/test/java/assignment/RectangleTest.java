package assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getArea() {
        Rectangle rectangle = new Rectangle(25,10);
        double a = rectangle.getArea();
        assertEquals(250.0, a, 0.1);
    }

    @Test
    public void getPerimeter() {
        Rectangle rectangle1 = new Rectangle(25,10);
        double a = rectangle1.getPerimeter();
        assertEquals(70, a, 0.1);
    }
}