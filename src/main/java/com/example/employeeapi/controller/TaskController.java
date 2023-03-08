package com.example.employeeapi.controller;
import com.example.employeeapi.model.Task;
import com.example.employeeapi.repository.TaskRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TaskController {

    TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @PostMapping("/task")
    public String addTask(@RequestBody Task task) {
        taskRepository.save(task);
        return "Task saved";

    }
}
