package shape_management;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class RectangleTest {
    @Test
    public void testCalculateAreaWithValidSize() {
        Rectangle rectangle = new Rectangle(5, 6);
        double area = rectangle.calculateArea();
        assertEquals(area, 5 * 6);
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

}