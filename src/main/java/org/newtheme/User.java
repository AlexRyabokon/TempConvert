package org.newtheme;

/*3.1 Создайте класс `User` со следующими полями: `id`, `name`, `email`, `password`. напишите утилитный (`static`) метод
`public static List<User> findDuplicates(List<User> collA, List<User> collB)`;
который возвращает дубликаты пользователей, которые есть в обеих коллекциях.
Одинаковыми считаем пользователей, у которых совпадают 2 поля: `id`, `email`.*/


import java.util.ArrayList;
import java.util.List;

public class User {


    public int id;
    public String name;
    public String email;
    public String password;

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public static List<User> findDuplicates(List<User> collA, List<User> collB) {

        List<User> resultList = new ArrayList<>();
        for (int i = 0; i < collA.size(); i++) {
            if (collA.get(i).id == collB.get(i).id) {
                resultList.add(collA.get(i));
            }
        }

        for (int i = 0; i < collA.size(); i++) {
            if (collA.get(i).email.equals(collB.get(i).email)) {
                resultList.add(collA.get(i));
            }
        }

        return resultList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class UserRealization {
    public static void main(String[] args) {

        User user1 = new User(1, "Alex", "alex@gmail.com", "x123");
        User user2 = new User(2, "Olga", "tim@gmail.com", "al3");
        User user3 = new User(3, "Sergey", "serg@gmail.com", "a23");
        User user4 = new User(4, "Inna", "inns@gmail.com", "le123");
        User user5 = new User(1, "Alex", "alex@gmail.com", "lex3");
        User user6 = new User(44, "Alex", "ex@gmail.com", "x123");
        User user7 = new User(55, "Olga", "ti121@gmail.com", "al3");
        User user8 = new User(33, "Sergey", "serg112@gmail.com", "a23");
        User user9 = new User(112, "Inna", "innwws@gmail.com", "le123");
        User user10 = new User(1, "Alex", "alex@gmail.com", "lex3");


        List<User> usersA = new ArrayList<>();
        usersA.add(user1);
        usersA.add(user2);
        usersA.add(user3);
        usersA.add(user4);
        usersA.add(user5);
        System.out.println();

        List<User> usersB = new ArrayList<>();
        usersB.add(user6);
        usersB.add(user7);
        usersB.add(user8);
        usersB.add(user9);
        usersB.add(user10);


        System.out.println(User.findDuplicates(usersA, usersB).toString());


    }
}
