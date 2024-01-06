package Day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        /*write a program with
        ArrayList<String> todoList = new ArrayList<String>();
        create a for loop that runs 5 times: will ask from you a task (String)  */

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>(
                List.of("Groceries", "Gym", "Insurance", "Assignments",
                        "Buy a smartphone"));
//        // Run following 5 times
//        for(int i = 1; i <= 5; i++){
//            System.out.println("Enter task "+ i);
//            String task = scanner.nextLine();
//            todoList.add(task);
//        }
        while (true) {
            displayTasks(todoList);
            System.out.println("Which task did you finish?");

            int task = scanner.nextInt();
            todoList.remove(task - 1);
            if (task == 0 || todoList.size()==0) {
                break;
            }

            todoList.remove(task -1);
        }
    }
    public static void displayTasks(ArrayList<String> tasks) {
        System.out.println("--------------------");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i));
        }
        System.out.println("--------------------");
    }
}



//    public static void displayTasks(ArrayList<String> tasks) {
//        for (int i = 0; i < tasks.size(); i++) {
//            System.out.println(i + " . " + tasks.get(i));
//        }
//    }




