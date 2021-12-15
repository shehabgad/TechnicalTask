package com.example.task_state_api.Application;

import com.example.task_state_api.Core.State;
import com.example.task_state_api.Core.Task;

import java.util.ArrayList;
import java.util.List;

public interface ITaskService {
    public boolean addTask(Task task);
    public boolean deleteTask(int ID);
    public boolean changeTaskState(int id,int state);
    public boolean changeTaskTitle(int ID ,String title);
    public List<Task> getAllTasks();
    public Task getTask(int ID);
}
