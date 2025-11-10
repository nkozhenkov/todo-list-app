package com.github.nkozhenkov.todoapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Task {

    private String taskName;
    private String taskDescription;
    private int ID;

    @Override
    public String toString() {
        return "Задача: " + getTaskName() + "\n" + "Описание: " + getTaskDescription() + "\n" +
                "ID задачи: " + getID();
    }
}
