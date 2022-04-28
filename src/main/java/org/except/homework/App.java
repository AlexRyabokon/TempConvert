package org.except.homework;

public class App {
    public static void main(String[] args) {
      UserAuthenticator user = new UserAuthenticator();
        try {
            user.loginException();
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }

        try {
            user.setPassword();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }


    }
}
