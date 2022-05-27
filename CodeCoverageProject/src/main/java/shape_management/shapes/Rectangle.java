package shape_management.shapes;
import shape_management.exceptions.InvalidSizeForCalculateAreaException;

public class Rectangle {
    final private double width;
    final private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        if (this.width >= 0 && this.height >= 0) {
            return this.width * this.height;
        }
        throw new InvalidSizeForCalculateAreaException(this.width, this.height);
    }
}
