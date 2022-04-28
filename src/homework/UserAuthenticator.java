package org.except.homework;

import java.util.Scanner;

public class UserAuthenticator {
    private String login;
    private String password;
    private String confirmPassword;


Scanner scanner = new Scanner(System.in);

    public UserAuthenticator() {
    }

    public UserAuthenticator(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin() throws UserAuthExeption {
        boolean cyrillic = login.chars()
                .mapToObj(Character.UnicodeBlock::of)
                .anyMatch(b -> b.equals(Character.UnicodeBlock.CYRILLIC));

            if (login.length()>20){
                throw new UserAuthExeption("Длина LOGIN должна быть меньше 20 символов");
            }else if (cyrillic==true){
                throw new UserAuthExeption("LOGIN Должен содержать только латинские буквы, цифры");
            } else { this.login = login;}
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() throws WrongPasswordException {

        boolean cyrillicForPassword = password.chars()
                .mapToObj(Character.UnicodeBlock::of)
                .anyMatch(b -> b.equals(Character.UnicodeBlock.CYRILLIC));

        if (password.length() > 20) {
            throw new WrongPasswordException("Длина должна быть меньше 20 символов");
        } else if (cyrillicForPassword == true) {
            throw new WrongPasswordException("должен содержать только латинские буквы, цифры и знак подчеркивания");
        } else if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("`password` и `confirmPassword` должны быть равны");
        }else{ this.password = password;}
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword() {
        this.confirmPassword = scanner.next();
    }


    public  String toString1() {
        return "UserAuthenticator{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' + '}';
    }

    public  void getAllInfo() {
        System.out.println(toString1());

    }



}
