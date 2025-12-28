package dk.mosberg.mam.mana;

public class InsufficientManaException extends Exception {
    public InsufficientManaException(String message) {
        super(message);
    }

    public InsufficientManaException(String message, Throwable cause) {
        super(message, cause);
    }
}
