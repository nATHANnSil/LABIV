package com.labdessoft.roteiro01.controller;

import com.labdessoft.roteiro01.entity.Task;
import com.labdessoft.roteiro01.repository.TaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class TaskControllerTest {

    @Mock
    private TaskRepository taskRepository;

    private TaskController taskController;

    @BeforeEach
    public void setup() {
        taskController = new TaskController();
        taskController.taskRepository = taskRepository;

        List<Task> taskList = new ArrayList<>();
        Task task = new Task();
        taskList.add(task);

        Mockito.when(taskRepository.findAll()).thenReturn(taskList);
    }

    @Test
    public void testListAll() {
        ResponseEntity<List<Task>> response = taskController.listAll();
        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(1, response.getBody().size());
    }
}
