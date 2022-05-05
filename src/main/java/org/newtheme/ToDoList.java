package org.newtheme;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<String> toDoList = new ArrayList<>();

    public void addToList(String task){
        toDoList.add(task);
    }
   public void addToListAtPosition(int position, String task){
        toDoList.add(position, task);
   }


    public void printToDoList() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i +" - " + toDoList.get(i));
        }
    }

    public void changeTast(int position, String task){
        toDoList.set(position, task);
    }

    public void removeTask(String task){
        toDoList.remove(task);
    }
    public void removeTask(int position){
        toDoList.remove(position);
    }

    public int getTaskPriority(String task){
        return toDoList.indexOf(task);
    }

    public static void printOut(){
        System.out.println("Please choose an action: Press : \n" +
                "1 - to add a new item into toDoList\n" +
                "2 - to print out the list\n" +
                "3 - to update existing item\n" +
                "4 - to remove item\n" +
                "5 - to get task priority\n" +
                "6 - to add a new item at specific position\n" +
                "pres 0 to exit\n");
    }




    //GETTER
    public List<String> getToDoList() {
        return toDoList;
    }
  //SETTER
    public void setToDoList(List<String> toDoList) {
        this.toDoList = toDoList;
    }


}
