package com.crm.repository;

import java.util.ArrayList;

import com.crm.model.Task;

public interface TaskRepository {

    ArrayList<Task> getAllTasks();
    void saveTask(Task task);
    

}
