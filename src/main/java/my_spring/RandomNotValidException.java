package my_spring;

public class RandomNotValidException extends RuntimeException {
    public RandomNotValidException(String message) {
        super(message);
    }
}
