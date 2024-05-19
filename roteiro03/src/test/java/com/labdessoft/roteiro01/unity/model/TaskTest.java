package com.labdessoft.roteiro01.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaskTest {

    private Task task;

    @BeforeEach
    public void setup() {
        task = new Task();
        task.setType(Task.TaskType.DATA);
        task.setPriority(Task.PriorityLevel.ALTA);
        task.setDueDate(LocalDate.now());
        task.setStatus(Task.TaskStatus.PREVISTA);
    }

    @Test
    public void testGetType() {
        assertEquals(Task.TaskType.DATA, task.getType());
    }

    @Test
    public void testGetPriority() {
        assertEquals(Task.PriorityLevel.ALTA, task.getPriority());
    }

    @Test
    public void testGetDueDate() {
        assertEquals(LocalDate.now(), task.getDueDate());
    }

    @Test
    public void testGetStatus() {
        assertEquals(Task.TaskStatus.PREVISTA, task.getStatus());
    }
}
