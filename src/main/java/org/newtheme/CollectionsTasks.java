package org.newtheme;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsTasks {

    /*
    * 1) Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList (+). Напишите еще один метод, который
    * выбирает из заполненного списка элемент наугад 100000 раз. Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
    */

   public  ArrayList<Integer> arList = new ArrayList<>();
   public  LinkedList<Integer> linkList = new LinkedList<>();

    public static void addElements(ArrayList<Integer> someArrayList, LinkedList<Integer> someLinkList){
        int A = 1000001;
        int B = 100000;

        for (int i = 0; i < A; i++) {

            someArrayList.add((int) (Math.random()*100000));
            someLinkList.add((int) (Math.random()*100000));
            System.out.print("Element of -AL- #"+i+" --- "+someArrayList.get(i) + "\n");
            System.out.print("Element of -LL- #"+i+" --- "+someLinkList.get(i)  + "\n");

            }

        for (int i = (int) (Math.random()*100000); i < B; i++) {
            System.out.print("-AL- #"+i+" --- "+someArrayList.get(i) + "\n");
            System.out.print("-LL- #"+i+" --- "+someLinkList.get(i)  + "\n");
        }

        }
/*
Решение по https://habr.com/ru/post/440436/
*/

    public static void compare2Lists() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }


    }





class real{
    public static void main(String[] args) {

            CollectionsTasks task = new CollectionsTasks();


    }
}
