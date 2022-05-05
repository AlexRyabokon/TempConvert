package org.except.homework;

import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
      UserAuthenticator user = new UserAuthenticator();
      boolean someError;

      do {
          someError = false;
          try {
              user.loginException();
          } catch (WrongLoginException e) {
              someError = true;
              e.printStackTrace();
              UserAuthenticator.registerForm();
          }

          try {
              user.setPassword();

          } catch (WrongPasswordException e) {
              someError = true;
              e.printStackTrace();
              UserAuthenticator.registerForm();

          }
      }while (someError == true);

       /* ArraysExc ar = new ArraysExc();
        try {
            ar.getIntFromArr();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("from 0 to 10");
        } catch (NullPointerException e){
            System.out.println("You put NULL");
        } catch (InputMismatchException e){
            System.out.println("Vvedite chislo");
        }*/


    }
}
