package registration;

//    1. Создать класс, в котором будет статический метод.
//    Этот метод принимает на вход три параметра: Login, Password, confirmPassword.
//    Все поля имеют тип данных String.
//    Длина login должна быть меньше 20 символов и не должен содержать пробелы.
//    Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.

//    Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
//    Также password и confirmPassword должны быть равны.
//    Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//    WrongPasswordException n WrongLoginException - пользовательские классы исключения с двумя конструкторами - один по умолчанию,
//    второй принимает сообщение исключения и передает его в конструктор класса Exception.
//    Метод возвращает true, если значения верны или false в другом случае.

public class Registration {
    public static boolean validator(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Invalid login: length should be less than 20 characters and should not contain spaces.");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Invalid password: length should be less than 20 characters, should not contain spaces, and should contain at least one digit.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match.");
        }
    }
}
