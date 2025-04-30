package com.tasks.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.tasks.Dto.ApiResponse;
import com.tasks.Entity.Tasks;


import java.util.List;
import com.tasks.Entity.Tasks;

public interface TaskService {
    Tasks add(Tasks task);
    List<Tasks> getAllTasks();
    void deleteTask(Long id);
    Tasks updateTask(Long id, Tasks updatedTask);
}
