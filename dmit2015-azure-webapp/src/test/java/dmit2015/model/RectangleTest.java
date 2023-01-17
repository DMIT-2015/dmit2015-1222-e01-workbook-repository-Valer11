package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
       Rectangle rectangle = new Rectangle(5,10);
       assertEquals(50, rectangle.area());
    }

    @Test
    void perimeter() {
    }

    @Test
    void diagonal() {
    }
}