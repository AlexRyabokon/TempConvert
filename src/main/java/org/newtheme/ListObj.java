package org.newtheme;


import java.util.*;

public class ListObj {
   /*       1.1 Создать объект `list` коллекции строк.
            1.2 Добавить в коллекцию `list` любую строку.
            1.3 Добавить в коллекцию `list` еще одну произвольную строку.
            1.4 Создать еще один объект `list1` коллекции строк.
            1.5 Добавить 10 произвольных строк в коллекцию `list1`.
            1.6 Добавить все элементы из коллекции `list1` в коллекцию `list`. Сделать все возможные варианты.
            1.7 Заменить строку с индексом `3` в коллекции `list` на строку `qwerty`.
            1.8 Проверить находится ли строка `qwerty` в коллекции `list`.
            1.9 Отсортировать коллекцию `list` в алфавитном порядке.
            1.10 Вывести содержимое коллекции в консоль.
            1.11 Удалить элементы в которых находиться буква `a`.
            1.12 Создать объект коллекции чисел `list2`.
            1.13 Наполнить коллекцию `list2` случайными числами.
            1.14 Отсортировать числа в порядке возрастания коллекции `list2`.
            1.15 Отсортировать числа в порядке убывания коллекции `list2`.
            1.15 Убрать дубликаты цифр коллекции `list2`.
    */

    List<String> list = new ArrayList<>();
    List<String> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public static void foo(List<String> someList, String... strings) {
        someList.addAll(Arrays.asList(strings));
        //System.out.println(someList);
    }

    /*
      1.12 Создать объект коллекции чисел `list2`.
      1.13 Наполнить коллекцию `list2` случайными числами.
    */
    public static void foo(List<Integer> someList, Integer... integers) {
        someList.addAll(Arrays.asList(integers));

    }

    //Добавить все элементы из коллекции `list1` в коллекцию `list`. Сделать все возможные варианты.
    public void oneInOne(List<String> oneList, List<String> secondList) throws IndexOutOfBoundsException {
       /* for (int i = 0; i < oneList.size(); i++) {
            secondList.add(oneList.get(i));
        }*/
        secondList.addAll(oneList);

    }

    public void putInIndex(int index, String stringToPut, List<String> someList) {
        someList.set(index, stringToPut);
        // System.out.println(someList);
    }

    public void stringExist(String string, List<String> someList) {
        if (someList.contains(string)) {
            System.out.println(string + " exists in this List, it`s index: " + someList.indexOf(string));
        } else {
            System.out.println(string + " do not exist in this List");
        }
    }

    /*1.9 Отсортировать коллекцию `list` в алфавитном порядке.*/
    public List<String> alphabeticSortedArrayList(List<String> unsortedList) {
        Collections.sort(unsortedList);
        return unsortedList;
    }

    /*
      1.14 Отсортировать числа в порядке возрастания коллекции `list2`.
      1.15 Отсортировать числа в порядке убывания коллекции `list2`.
    */

    public List<Integer> sortedIntegers(List<Integer> unsortedList) {
        Collections.sort(unsortedList);
        return unsortedList;
    }

    public List<Integer> reverseSortedIntegers(List<Integer> unsortedList) {
        Collections.reverse(sortedIntegers(unsortedList));
        return unsortedList;
    }

    //1.11 Удалить элементы в которых находиться буква `a`.

    public List<String> deleteElement(List<String> someList, String triggerString) {
        String[] wordsFromsentences = {};
        List<String> wordsList = new ArrayList<>();
        for (int i = 0; i < someList.size(); i++) {
            wordsFromsentences = someList.get(i).split(" ");
            Collections.addAll(wordsList, wordsFromsentences);
            for (int j = 0; j < wordsList.size(); j++) {
                if (wordsList.get(j).contains(triggerString)) {
                    wordsList.remove(j);
                }
            }
        }
        return wordsList;
    }

    //1.15 Убрать дубликаты цифр коллекции `list2`.
    // 2.1 Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }


}

class ListObjRealization {
    public static void main(String[] args) {
        ListObj lo = new ListObj();

        ListObj.foo(lo.list, "wett rrr ddd ");
        ListObj.foo(lo.list1, "1.1 Создать объект `list` коллекции строк.\n",
                "1.2 Добавить в коллекцию `list` любую строку.\n",
                "  1.3 Добавить в коллекцию `list` еще одну произвольную строку.\n",
                " 1.4 Создать еще один объект `list1` коллекции строк.\n",
                " 1.5 Добавить 10 произвольных строк в коллекцию `list1`.\n",
                " 1.6 Добавить все элементы из коллекции `list1` в коллекцию `list`. Сделать все возможные варианты.\n",
                "  1.7 Заменить строку с индексом `3` в коллекции `list` н строку `qwerty`.\n",
                " 1.8 Проверить находится ли строка `qwerty` в коллекции `list`.\n",
                "  1.9 Отсортировать коллекцию `list` в алфавитном порядке.   \n",
                "   1.10 Вывести содержимое коллекции в консоль.");

        ListObj.foo(lo.list2, (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100),(int) (Math.random()*100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random()*100),
                (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random()*100), (int) (Math.random()*100));
        System.out.println(lo.list2);


        //lo.putInIndex(3, "qwerty", lo.list1);
        //lo.stringExist("qwerty", lo.list1);
        //System.out.println(lo.alphabeticSortedArrayList(lo.list1));
        //System.out.println(lo.deleteElement(lo.list1, "а"));
        System.out.println(lo.sortedIntegers(lo.list2));
        System.out.println(lo.reverseSortedIntegers(lo.list2));
        System.out.println(ListObj.removeDuplicates(lo.list2));
    }
}
