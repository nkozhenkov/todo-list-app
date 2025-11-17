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
        System.out.println("Задача успешно создана!" + "\n");
        MessageConstants.printAvailableCommands();

    }

    public void showTaskList() {

        if (tasksList.isEmpty()) {
            System.out.println("Список задач пуст." + "\n");
            MessageConstants.printAvailableCommands();
            return;
        }

        for (int i = 0; i < tasksList.size(); i++) {
            System.out.println((i + 1) + ". " + tasksList.get(i));
        }
    }

    public void deleteTask() {

        System.out.println("Введите ID задачи, которую хотите удалить");
        int enteredID = Integer.parseInt(scanner.nextLine().trim());

        boolean removed = tasksList.removeIf(task -> task.getID() == enteredID);

        if (removed) {
            System.out.println("Задача с ID " + enteredID + " успешно удалена." + "\n");
        } else {
            System.out.println("Задача с ID " + enteredID + " не найдена!");
        }
        MessageConstants.printAvailableCommands();

    }

    public void changeTask() {
        System.out.println("Введите ID задачи, которую хотите изменить");
        int enteredID = Integer.parseInt(scanner.nextLine().trim());

        for (Task task : tasksList) {
            if (task.getID() == enteredID) {
                System.out.println("Вы редактируете задачу:");
                System.out.println(task + "\n");
                System.out.println("Введите новое название задачи:");
                String newName = scanner.nextLine().trim();
                task.setTaskName(newName);
                System.out.println("Введите новое описание задачи:");
                String newDescription = scanner.nextLine().trim();
                task.setTaskDescription(newDescription);
                System.out.println("Задача успешно обновлена!");
                return;
            }
        }
        System.out.println("Задача с ID " + enteredID + " не найдена!");
    }

    private int setID() {

        int futureID = 1;

        if (tasksList.isEmpty()) {
            return 1;
        }

        Set<Integer> existingIDs = new HashSet<>();
        for (Task task : tasksList) {
            existingIDs.add(task.getID());
        }

        while (existingIDs.contains(futureID)) {
            futureID++;
        }

        return futureID;
    }

}
