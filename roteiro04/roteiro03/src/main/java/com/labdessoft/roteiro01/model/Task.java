package com.labdessoft.roteiro01.model;

import java.time.LocalDate;

public class Task {

    public enum TaskType {
        DATA, PRAZO, LIVRE
    }

    public enum PriorityLevel {
        ALTA, MEDIA, BAIXA
    }

    public enum TaskStatus {
        PREVISTA, ATRASADA, CONCLUIDA
    }

    private TaskType type;
    private PriorityLevel priority;
    private LocalDate dueDate;
    private TaskStatus status;

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    public void setPriority(PriorityLevel priority) {
        this.priority = priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
