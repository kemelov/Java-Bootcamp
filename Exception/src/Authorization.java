import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.util.Scanner;

public class Authorization {
    public static boolean login(String username, String pw, String confirmpw) throws WrongLoginException, WrongPasswordException {
        boolean usernameMatches = username.matches("^[a-zA-Z0-9.]+$")&username.length()>=8;
        boolean pwMatches = pw.matches("\\w+")&pw.equals(confirmpw)&pw.length()>=8;



        if (!usernameMatches){
            throw new WrongLoginException("Неправильный логин!  Login должен содержать только латинские\n" +
                    "буквы, цифры и спецсимволы. Длина login должна быть не меньше 8\n" +
                    "символов.");
        } else {
            System.out.println("Логин ✓");
        }

        if (!pwMatches){
            throw new WrongPasswordException("Ошибка!  пароль должен содержать только латинские\n" +
                    "буквы, цифры и знак подчеркивания. Длина пароль должна быть не меньше 8\n" +
                    "символов.");
        } else {
            System.out.println("Пароль ✓");
        }

        return usernameMatches&pwMatches;
    }

    public static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String username = sc.next();
        System.out.print("Введите пароль: ");
        String password = sc.next();
        System.out.print("Введите повторно пароль: ");
        String confirmPW = sc.next();
        try {
            System.out.println(Authorization.login(username, password, confirmPW));
        } catch (WrongLoginException wrongLogin ){
            System.out.println(wrongLogin.getDescription());
        } catch (WrongPasswordException wrongPW){
            System.out.println(wrongPW.getDescription());
        }
    }

}
