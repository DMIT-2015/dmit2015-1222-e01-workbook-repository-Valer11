package dmit2015.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleParamTest {

    @ParameterizedTest(name = "width = {0}, length = {1}, expected result = {2}")
    @CsvSource({
            "5,10,50",
            "20,20,400",
            "50,50,2500"
    })
    void area(double length, double width, double expectedArea) {
        //Arrange and //Act
        Rectangle rectangle2 = new Rectangle(length, width);
        //Assert
        assertEquals(expectedArea, rectangle2.area(), 0.05);
    }

    @ParameterizedTest(name = "width = {0}, length = {1}, expected result = {2}")
    @CsvSource({
            "5,10,30",
            "20,20,80",
            "50,50,200"
    })
    void perimeter(double length, double width, double expectedPerimeter) {
        //Arrange and //Act
        Rectangle rectangle2 = new Rectangle(length, width);
        //Assert
        assertEquals(expectedPerimeter, rectangle2.perimeter(), 0.05);
    }

    @ParameterizedTest(name = "width = {0}, length = {1}, expected result = {2}")
    @CsvSource({
            "5,10,11.18034",
            "20,20,28.28427",
            "50,50,70.71068"
    })
    void diagonal(double length, double width, double expectedDiagonal) {
        //Arrange and //Act
        Rectangle rectangle2 = new Rectangle(length, width);
        //Assert
        assertEquals(expectedDiagonal, rectangle2.diagonal(), 0.0005);
    }
}