package org.except.homework;

public class App {
    public static void main(String[] args) {
        UserAuthenticator user = new UserAuthenticator("qwetye", "4ww44", "4ww44");

        try {
            user.setLogin();
        } catch (UserAuthExeption e) {
            e.printStackTrace();
        }

        try {
            user.setPassword();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }

        user.getAllInfo();

    }
}
