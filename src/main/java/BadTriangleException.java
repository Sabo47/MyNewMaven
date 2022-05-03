public class   BadTriangleException extends Exception{
    public BadTriangleException() {
        super("Bad trianlge - it is impossible to count square of triangle due to wrong length of lines.");
    }
}