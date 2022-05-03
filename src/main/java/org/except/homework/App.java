package org.except.homework;

import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
     // UserAuthenticator user = new UserAuthenticator();
       /* try {
            user.loginException();
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }

        try {
            user.setPassword();
        } catch (WrongPasswordException e) {
            e.printStackTrace();

        }
*/

        ArraysExc ar = new ArraysExc();
        try {
            ar.getIntFromArr();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("from 0 to 10");
        } catch (NullPointerException e){
            System.out.println("You put NULL");
        } catch (InputMismatchException e){
            System.out.println("Vvedite chislo");

        }


    }
}
