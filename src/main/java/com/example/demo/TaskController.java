package com.example.demo; // Controller folder se bahar hai toh yehi package hoga

import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService; 

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
    @PutMapping("/{id}")
public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
    return taskService.updateTask(id, taskDetails);
}
    @DeleteMapping("/{id}")
public String deleteTask(@PathVariable Long id) {
    taskService.deleteTask(id);
    return "Task with ID " + id + " has been deleted successfully!";
}
}