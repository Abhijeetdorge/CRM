package com.crm.controller;

import com.crm.model.Task;
import com.crm.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import java.util.ArrayList;

@Controller // Use @Controller instead of @RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    // @GetMapping("/tasks")
    // public String getAllTasks(Model model) {
    //     ArrayList<Task> tasks = taskService.getAllTasks();
    //     model.addAttribute("tasks", tasks);
    //     return "task"; 
    // }

    @PostMapping("/tasks")
    public String saveTask(@ModelAttribute Task task, Model model) {
        taskService.saveTask(task);
        model.addAttribute("message", "Task saved successfully!");
        return "index"; 
    }
    @GetMapping("/index.html")
    public String index() {
        return "index"; 
    }

    @GetMapping("/")
    public String home() {
        return "home"; 
    }
    @GetMapping("/home.html")
    public String homepage() {
        return "home"; 
    }

    @GetMapping("/task.html")
    public String showTaskPage() {
        return "task"; 
    }
    @GetMapping("/tasks")
    public String TaskPage() {
        return "task"; 
    }
}
