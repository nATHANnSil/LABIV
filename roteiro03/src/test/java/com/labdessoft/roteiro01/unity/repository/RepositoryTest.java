package com.labdessoft.roteiro01.repository;

import com.labdessoft.roteiro01.entity.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class TaskRepositoryTest {

    @Mock
    private TaskRepository taskRepository;

    @BeforeEach
    public void setup() {
        Task task = new Task();
        task.setId(1L);
        task.setName("Test Task");
        when(taskRepository.findById(1L)).thenReturn(Optional.of(task));
    }

    @Test
    public void whenFindById_thenReturnTask() {
        Task found = taskRepository.findById(1L).orElse(null);
        assertNotNull(found);
        assertEquals(found.getName(), "Test Task");
    }
}

@ExtendWith(MockitoExtension.class)
public class RepositoryTest {

    @Mock
    private Repository repository;

    @BeforeEach
    public void setup() {
        // Configure your setup here if needed
    }

    @Test
    public void testRepository() {
        // Add your test cases here
    }
}
