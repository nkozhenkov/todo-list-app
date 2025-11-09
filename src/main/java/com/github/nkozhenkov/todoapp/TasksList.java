package com.github.nkozhenkov.todoapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TasksList {

    private final List<Task> tasksList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void createTask() {

        while (true) {

            System.out.println("Введите название задачи");
            String taskName = scanner.nextLine();
            System.out.println("Введите описание задачи");
            String taskDescription = scanner.nextLine();
            Task newTask = new Task(taskName, taskDescription);
            tasksList.add(newTask);
            System.out.println("Задача успешно создана!");
            MessageConstants.printAvailableCommands();
            break;

        }

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

}
