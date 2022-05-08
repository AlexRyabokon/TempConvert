package org.newtheme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListTest {
    private LinkedList<String> toDoList = new LinkedList<>();

    public void addToList(String task) {
        toDoList.addFirst(task);
    }
    public void addToLastList(String task) {
        toDoList.addLast(task);
    }

    public void addToListAtPosition(int position, String task) {
        toDoList.add(position, task);
    }


    public void printToDoList() {
        for (int i = 0; i < toDoList.size(); i++) {
                System.out.println(i + " - " + toDoList.get(i));
        }
    }

    public void changeTast(int position, String task) {
        toDoList.set(position, task);
    }

    public void removeTask(String task) {
        toDoList.remove(task);
    }

    public void removeTask(int position) {
        toDoList.remove(position);
    }

    public int getTaskPriority(String task) {
        return toDoList.indexOf(task);
    }

    public void printInfo(){
        Iterator<String> iterator = toDoList.iterator() ;

        while (iterator.hasNext()){
            System.out.println("Element --- " + iterator.next());
        }
    }

}

class realization {

    public static void main(String[] args) {
        LinkListTest linkList = new LinkListTest();
        linkList.addToList("First");
        linkList.addToList("Second");
        linkList.addToLastList("forum");
        linkList.addToList("Third");
        linkList.addToLastList("forum1");

        linkList.printInfo();


    }


}
