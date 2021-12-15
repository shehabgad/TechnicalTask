package com.example.task_state_api;

import com.example.task_state_api.Application.ITaskService;
import com.example.task_state_api.Application.TaskService;

import java.util.List;

import com.example.task_state_api.Core.Task;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ComponentScan(basePackageClasses = TaskController.class)
public class TaskController {
    private ITaskService taskService;
    public TaskController() {
        taskService = new TaskService();
    }
    @GetMapping("/tasks")
    public List<Task> getAll() {
        return taskService.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task get(@PathVariable int id) {
        return taskService.getTask(id);
    }

    @PostMapping("/task")
    public boolean add(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @PutMapping("/tasks/{id}/{state}/updatestate")
    public boolean changeState(@PathVariable int id, @PathVariable int state) {
        return taskService.changeTaskState(id,state);
    }

    @PutMapping("/tasks/{id}/{title}/updateTitle")
    public boolean changeState(@PathVariable int id, @PathVariable String title) {
        return taskService.changeTaskTitle(id,title);
    }

    @DeleteMapping("/tasks/{id}/delete")
    public boolean deleteTask(@PathVariable int id) {
        return taskService.deleteTask(id);
    }

}
