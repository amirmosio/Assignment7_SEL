package shape_management.shapes;

import shape_management.exceptions.InvalidSizeForCalculateAreaException;

public class Square {
    private double size;

    public Square(double size) {
        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double calculateArea() {
        if (this.size >= 0) {
            return this.size * this.size;
        }
        throw new InvalidSizeForCalculateAreaException(this.size, this.size);
    }
}
