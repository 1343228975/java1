package ch13.exception;

public class BussException extends Exception{
    public BussException() {
    }

    public BussException(String message) {
        super(message);
    }

    public BussException(String message, Throwable cause) {
        super(message, cause);
    }

    public BussException(Throwable cause) {
        super(cause);
    }
}
