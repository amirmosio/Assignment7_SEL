package shape_management.shapes;

import org.junit.Test;
import shape_management.shapes.Rectangle;
import shape_management.exceptions.InvalidSizeForCalculateAreaException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class RectangleTest {
    @Test
    public void testCalculateAreaWithValidSize() {
        Rectangle rectangle = new Rectangle(5, 6);
        double area = rectangle.calculateArea();
        assertEquals(area, 5 * 6, 0.00001);
    }

    @Test
    public void testCalculateAreaWithInvalidWidthSize() {
        Rectangle rectangle = new Rectangle(-5, 6);
        boolean exception = false;
        try {
            double area = rectangle.calculateArea();
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);
    }

    @Test
    public void testCalculateAreaWithInvalidHeightSize() {
        Rectangle rectangle = new Rectangle(5, -6);
        boolean exception = false;
        try {
            double area = rectangle.calculateArea();
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);
    }

    @Test
    public void testCalculateAreaWithInvalidWidthAndHeightHeightSize() {
        Rectangle rectangle = new Rectangle(-5, -6);
        boolean exception = false;
        try {
            double area = rectangle.calculateArea();
        } catch (InvalidSizeForCalculateAreaException e) {
            exception = true;
        }
        assertTrue(exception);
    }

    @Test
    public void testCalculateAreaAfterWidthHeightChange() {
        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.setWidth(7);
        rectangle.setHeight(8);
        double area = rectangle.calculateArea();
        assertEquals(area, 8 * 7, 0.00001);
    }

}