package registration;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Wrong Password");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
