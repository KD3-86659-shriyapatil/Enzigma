package com.tasks.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tasks.Dto.ApiResponse;
import com.tasks.Entity.Tasks;
import com.tasks.Repository.TaskRepository;
import com.tasks.custom_exception.ResourceNotFoundException;

import jakarta.transaction.Transactional;
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Tasks add(Tasks task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Tasks> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public Tasks updateTask(Long id, Tasks updatedTask) {
        Optional<Tasks> optionalTask = taskRepository.findById(id);
        if (optionalTask.isPresent()) {
            Tasks existingTask = optionalTask.get();
            existingTask.setAssignedTo(updatedTask.getAssignedTo());
            existingTask.setStatus(updatedTask.getStatus());
            existingTask.setDueDate(updatedTask.getDueDate());
            existingTask.setPriority(updatedTask.getPriority());
            existingTask.setComments(updatedTask.getComments());
            return taskRepository.save(existingTask);
        } else {
            throw new RuntimeException("Task not found with id: " + id);
        }
    }
}