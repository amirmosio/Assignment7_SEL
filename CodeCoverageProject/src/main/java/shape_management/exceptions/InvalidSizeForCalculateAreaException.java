package shape_management.exceptions;

public class InvalidSizeForCalculateAreaException extends RuntimeException {

    public InvalidSizeForCalculateAreaException(double width, double height) {
        super("Invalid shape for calculateArea: " + "width:" + width + ", height:" + height);
    }

}
