package com.example.task_state_api.Application;

import com.example.task_state_api.Core.State;
import com.example.task_state_api.Core.Task;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class TaskService implements ITaskService {
    private static List<Task> tasks = new ArrayList<Task>();
    static int ID = 1;
    @Override
    public boolean addTask(Task task) {
        if(tasks.size() == 0)
            ID = 1;
        task.setTaskID(ID);
        ID++;
        return tasks.add(task);
    }

    @Override
    public boolean deleteTask(int ID) {
        for(int i = 0; i < tasks.size(); i++)
        {
            if(tasks.get(i).getTaskID() == ID)
                return tasks.remove(tasks.get(i));
        }
        return false;
    }

    @Override
    public boolean changeTaskState(int ID ,int state) {
        Task task = null;
        for(int i = 0; i < tasks.size(); i++)
        {
            if(tasks.get(i).getTaskID() == ID)
            {
             task = tasks.get(i);
             break;
            }
        }
        if(task != null)
        {
            return task.setState(state);
        }
        return false;
    }

    @Override
    public boolean changeTaskTitle(int ID ,String title) {
        Task task = null;
        for(int i = 0; i < tasks.size(); i++)
        {
            if(tasks.get(i).getTaskID() == ID)
            {
                task = tasks.get(i);
                break;
            }
        }
        if(task != null)
        {
            return task.setTitle(title);
        }
        return false;
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public Task getTask(int ID) {
        for(int i = 0; i < tasks.size(); i++)
        {
            if(tasks.get(i).getTaskID() == ID)
                return tasks.get(i);
        }
        return null;
    }
}
