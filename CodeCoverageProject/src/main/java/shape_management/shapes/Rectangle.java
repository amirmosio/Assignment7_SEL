package shape_management.shapes;
import shape_management.interfaces.AreaCalculable;
import shape_management.exceptions.InvalidSizeForCalculateAreaException;

public class Rectangle implements AreaCalculable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        if (this.width >= 0 && this.height >= 0) {
            return this.width * this.height;
        }
        throw new InvalidSizeForCalculateAreaException(this.width, this.height);
    }
}
