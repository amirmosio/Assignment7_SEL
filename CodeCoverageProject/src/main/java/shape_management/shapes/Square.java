package shape_management.shapes;

import shape_management.exceptions.InvalidSizeForCalculateAreaException;
import shape_management.interfaces.AreaCalculable;

public class Square implements AreaCalculable {
    double size;

    public Square(double size) {
        this.size = size;
    }

    public void setWidth(double width) {
        this.size = width;
    }

    public void setHeight(double height) {
        this.size = height;
    }

    @Override
    public double calculateArea() {
        if (this.size >= 0) {
            return this.size * this.size;
        }
        throw new InvalidSizeForCalculateAreaException(size, size);
    }
}
