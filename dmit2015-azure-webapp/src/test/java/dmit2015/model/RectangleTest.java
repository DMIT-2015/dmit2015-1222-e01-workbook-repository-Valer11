package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
       Rectangle rectangle1 = new Rectangle(5,10);
       assertEquals(50, rectangle1.area());
    }

    @Test
    void perimeter() {
        Rectangle rectangle1 = new Rectangle(5,10);
        assertEquals(30, rectangle1.perimeter());
    }

    @Test
    void diagonal() {
        Rectangle rectangle1 = new Rectangle(5,10);
        assertEquals(11.18034, rectangle1.diagonal(), 0.005);
    }
}