package com.github.nkozhenkov.todoapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TasksList {

    private final List<Task> tasksList = new ArrayList<>();

    public void createTask() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название задачи");
            String taskName = scanner.nextLine();
            System.out.println("Введите описание задачи");
            String taskDescription = scanner.nextLine();
            Task newTask = new Task();
            newTask.setTaskName(taskName);
            newTask.setTaskDescription(taskDescription);
            tasksList.add(newTask);
            System.out.println("Задача успешно создана!");
            break;
        }

    }

    public void showTaskList() {
        System.out.println(tasksList);
    }

}
