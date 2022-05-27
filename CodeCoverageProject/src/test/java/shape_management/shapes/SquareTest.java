package shape_management.shapes;

import org.junit.Test;
import shape_management.exceptions.InvalidSizeForCalculateAreaException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class SquareTest {
    @Test
    public void testCalculateAreaWithValidSize() {
        Square square = new Square(5);
        double area = square.calculateArea();
        assertEquals(area, 5 * 5, 0.00001);
    }


    @Test
    public void testCalculateAreaWithInvalidSize() {
        Square square = new Square(-5);
        boolean exception = false;
        try {
            double area = square.calculateArea();
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);
    }

    @Test
    public void testCalculateAreaAfterWidthSizeChange() {
        Square square = new Square(5);
        square.setWidth(7);
        double area = square.calculateArea();
        assertEquals(area, 7 * 7, 0.00001);
    }

    @Test
    public void testCalculateAreaAfterHeightSizeChange() {
        Square square = new Square(5);
        square.setHeight(7);
        double area = square.calculateArea();
        assertEquals(area, 7 * 7, 0.00001);
    }
}