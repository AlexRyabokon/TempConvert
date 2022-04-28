package org.except.homework;
/*
* Создать класс `UserAuthenticator`. Создать статический метод который принимает на вход три параметра: `login`, `password` и `confirmPassword`.

Правила для `login`:
- Должен содержать только латинские буквы, цифры.
- Длина должна быть меньше 20 символов.

Если `login` не соответствует этим требованиям, необходимо выбросить `WrongLoginException`.

Правила для `password`:
- должен содержать только латинские буквы, цифры и знак подчеркивания.
- Длина должна быть меньше 20 символов.
- `password` и `confirmPassword` должны быть равны.

Если `password` не соответствует этим требованиям, необходимо выбросить `WrongPasswordException`.

`WrongPasswordException` и `WrongLoginException` - пользовательские классы исключения с двумя конструкторами
 – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 Обработка исключений проводится вне метода (В сигнатуре метода должно быть указано что он может бросить исключения).
 Используем `multi-catch block`. Метод возвращает `true`, если значения верны или `false` в другом случае.

* */
import java.util.Scanner;

public class UserAuthenticator {
    static Scanner scanner = new Scanner(System.in);

    public static String userName;
    public static String password;
    public static String checkPassword;

    public String userName1;
    public String password1;
    public  String checkPassword1;

    public UserAuthenticator() {
        registerForm();
        this.userName1 = UserAuthenticator.userName;
        this.password1 = UserAuthenticator.password;
        this.checkPassword1 = UserAuthenticator.checkPassword;
        System.out.println("| Имя пользователя: "+userName1+" || Пароль пользователя: "+password1+" ||| Повтoр пароля: "+checkPassword1);
    }


    public static void registerForm(){
        System.out.println("Пожалуйста, введите свой логин, пароль и проверку пароля");
        userName      = scanner.nextLine();
        password      = scanner.nextLine();
        checkPassword = scanner.nextLine();
        //System.out.println(userName+ " " + password + " " + checkPassword);
    }

    public void loginException() throws WrongLoginException {

        boolean cyrillic = userName1.chars()
                .mapToObj(Character.UnicodeBlock::of)
                .anyMatch(b -> b.equals(Character.UnicodeBlock.CYRILLIC));

        if (userName1.length()>20){
            throw new WrongLoginException("Длина LOGIN должна быть меньше 20 символов");
        }else if (cyrillic){
            throw new WrongLoginException("LOGIN Должен содержать только латинские буквы, цифры");
        }

    }

    public void setPassword() throws WrongPasswordException {

        boolean cyrillicForPassword = password.chars()
                .mapToObj(Character.UnicodeBlock::of)
                .anyMatch(b -> b.equals(Character.UnicodeBlock.CYRILLIC));

        if (password1.length() > 20) {
            throw new WrongPasswordException("Длина должна быть меньше 20 символов");
        } else if (cyrillicForPassword) {
            throw new WrongPasswordException("Password должен содержать только латинские буквы, цифры и знак подчеркивания");
        } else if(!password1.contains("_")){
            throw new WrongPasswordException("`password` должен содержать нижнее подчеркивание");
        } else if (!password1.equals(checkPassword1)){
            throw new WrongPasswordException("`password` и `checkPassword` должны быть равны");
        }
    }





}
