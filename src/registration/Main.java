package registration;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        boolean isValid = Registration.validator("1235anastasiya", "mamasita1", "1mamasita1");
        System.out.println(isValid);
    }
}
