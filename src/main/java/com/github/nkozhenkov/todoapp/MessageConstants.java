package com.github.nkozhenkov.todoapp;

public class MessageConstants {

    public static final String AVAILABLE_COMMANDS = """
                Вам доступны следующие команды:\s
                создать - создание новой задачи
                просмотр - просмотреть список всех задач
                завершить - завершение работы программы""";

    public static void printAvailableCommands() {
        System.out.println(AVAILABLE_COMMANDS);
    }

}
