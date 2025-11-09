package com.github.nkozhenkov.todoapp;

import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        System.out.println("=== Консольное приложение Задачи ===" + "\n");
        System.out.println("""
                Для работы Вам доступны следующие команды:\s
                создать - создание новой задачи
                просмотр - просмотреть список всех задач""");

        TasksList tasksList = new TasksList();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду:");

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("создать")) {
                tasksList.createTask();
            } else if (command.equals("просмотр")) {
                tasksList.showTaskList();
            } else {
                System.out.println("Неверно введена команда, попробуйте ещё раз.");
                System.out.println("""
                Для работы Вам доступны следующие команды:\s
                создать - создание новой задачи
                просмотр - просмотреть список всех задач""");
            }
        }

    }
}
