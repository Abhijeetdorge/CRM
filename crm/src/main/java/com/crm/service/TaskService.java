package com.crm.service;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.model.Task;
import com.crm.repository.TaskJpaRepository;
import com.crm.repository.TaskRepository;

@Service
public class TaskService implements TaskRepository {

    @Autowired
    private TaskJpaRepository taskJpaRepository;

    @Override
    public ArrayList<Task> getAllTasks(){
        List<Task> list = taskJpaRepository.findAll();
        ArrayList<Task> tasks = new ArrayList<>(list);
        return tasks;
    }

    @Override
    public void saveTask(Task task){
        taskJpaRepository.save(task);
    }

}
