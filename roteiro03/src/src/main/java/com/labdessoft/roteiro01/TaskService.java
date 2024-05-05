package com.labdessoft.roteiro01.service;

import com.labdessoft.roteiro01.model.Task;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class TaskService {

    public enum TaskType {
        DATA, PRAZO, LIVRE
    }

    public enum PriorityLevel {
        ALTA, MEDIA, BAIXA
    }

    public enum TaskStatus {
        PREVISTA, ATRASADA, CONCLUIDA
    }

    public Task createTask(TaskType type, PriorityLevel priority, LocalDate dueDate, TaskStatus initialStatus) {
        Task task = new Task();
        task.setType(type);
        task.setPriority(priority);
        task.setDueDate(dueDate);
        task.setStatus(initialStatus);

        if (type == TaskType.DATA && dueDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data prevista de execução deve ser sempre igual ou superior a data atual.");
        }

        return task;
    }

    public TaskStatus getTaskStatus(Task task) {
        if (task.getType() == TaskType.LIVRE) {
            return task.getStatus();
        } else {
            if (task.getDueDate().isBefore(LocalDate.now())) {
                return TaskStatus.ATRASADA;
            } else if (task.getDueDate().isEqual(LocalDate.now()) || task.getDueDate().isAfter(LocalDate.now())) {
                return TaskStatus.PREVISTA;
            } else {
                return task.getStatus();
            }
        }
    }

    public void updateTaskStatus(Task task, TaskStatus newStatus) {
        task.setStatus(newStatus);
    }
}
