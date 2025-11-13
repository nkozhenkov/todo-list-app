package com.github.nkozhenkov.todoapp;

import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        System.out.println("=== Консольное приложение Задачи ===" + "\n");
        MessageConstants.printAvailableCommands();

        TasksList tasksList = new TasksList();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Введите команду:");

        boolean isRunning = true;
        while (isRunning) {
            String command = scanner.nextLine().trim();
            switch (command) {
                case "создать":
                    tasksList.createTask();
                    break;
                case "просмотр":
                    tasksList.showTaskList();
                    break;
                case "удалить":
                    tasksList.deleteTask();
                    break;
                case "завершить":
                    System.out.println("Программа завершила свою работу.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверно введена команда, попробуйте ещё раз.");
                    MessageConstants.printAvailableCommands();
                    break;
            }
        }

    }
}
