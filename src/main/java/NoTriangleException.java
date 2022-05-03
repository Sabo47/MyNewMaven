import java.util.*;

public class NoTriangleException extends Exception {
    public NoTriangleException() {
        super("The triangle does not exist.");
    }
}