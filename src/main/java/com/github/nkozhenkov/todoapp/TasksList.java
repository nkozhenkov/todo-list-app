package com.github.nkozhenkov.todoapp;

import java.util.*;

public class TasksList {

    private final List<Task> tasksList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void createTask() {

        System.out.println("Введите название задачи");
        String taskName = scanner.nextLine();
        System.out.println("Введите описание задачи");
        String taskDescription = scanner.nextLine();
        Task newTask = new Task(taskName, taskDescription, setID());
        tasksList.add(newTask);
        System.out.println("Задача успешно создана!");
        MessageConstants.printAvailableCommands();

    }

    public void showTaskList() {

        if (tasksList.isEmpty()) {
            System.out.println("Список задач пуст.");
            return;
        }

        for (int i = 0; i < tasksList.size(); i++) {
            System.out.println((i + 1) + ". " + tasksList.get(i));
        }
    }

    public void deleteTask() {

        System.out.println("Введите ID задачи, которую хотите удалить");
        int enteredID = Integer.parseInt(scanner.nextLine());

        for (Task task : tasksList) {
            if (task.getID() == enteredID) {
                tasksList.remove(task);
                System.out.println("Задача с ID " + enteredID + " успешно удалена.");
                return;
            }
        }
        System.out.println("Задача с ID " + enteredID + " не найдена!");
        MessageConstants.printAvailableCommands();

    }

    private int setID() {

        if (tasksList.isEmpty()) {
            return 1;
        }

        Set<Integer> existingIDs = new HashSet<>();
        for (Task task : tasksList) {
            existingIDs.add(task.getID());
        }

        int futureID = 1;

        while (existingIDs.contains(futureID)) {
            futureID++;
        }

        return futureID;
    }

}
