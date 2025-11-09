package com.github.nkozhenkov.todoapp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {

    private String taskName;
    private String taskDescription;

    @Override
    public String toString() {
        return "Задача: " + getTaskName() + "\n" + "Описание: " + getTaskDescription() + "\n";
    }
}
