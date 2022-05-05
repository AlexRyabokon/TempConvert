package org.newtheme;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ToDoList appList = new ToDoList();
        ToDoList.printOut();
        int param = scan.nextInt();
        while (param!=0){
            switch (param){
                case 1:
                    System.out.println("add a new item into toDoList");
                    scan.nextLine();
                    String task1 = scan.nextLine();
                    appList.addToList(task1);
                    System.out.println("Please choose tha next action by typing 0 - 6");
                    param = scan.nextInt();
                    break;
                case 2:
                    System.out.println("We are printing out the list");
                    appList.printToDoList();
                    System.out.println("Please choose tha next action by typing 0 - 6");
                    param = scan.nextInt();
                    break;
                case 3:
                    System.out.println("Please, enter an item to update");
                    scan.nextLine();
                    int num = scan.nextInt();
                    System.out.println("Please, enter a new task");
                    scan.nextLine();
                    String task3 = scan.nextLine();
                    appList.changeTast(num, task3);
                    System.out.println("Please choose tha next action by typing 0 - 6");
                    param = scan.nextInt();
                    break;
                case 4:
                    System.out.println("Please, enter a task to remove");
                    scan.nextLine();
                    String task4 = scan.nextLine();
                    appList.removeTask(task4);
                    param = scan.nextInt();
                    break;
                case 5:
                    System.out.println("Enter the number of list to get info about task priority");
                    scan.nextLine();
                    String task5 = scan.nextLine();
                    System.out.println("Priopity of te task is --- " +  appList.getTaskPriority(task5) );
                    param = scan.nextInt();
                    break;
                case 6:
                    System.out.println("Please enter the number of position for the task");
                    scan.nextLine();
                    int index = scan.nextInt();
                    System.out.println("Please, enter a new task");
                   String task6 = scan.nextLine();
                   appList.changeTast(index, task6);
                    param = scan.nextInt();
                    break;
                default:
                    System.out.println(" Please write normal parameter");
                    param = 0;


            }
        }

    }
}
