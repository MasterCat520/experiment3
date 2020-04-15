package com.example.demo.rest;

import com.example.demo.factory.TaskFactory;
import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("")
@RestController
public class TaskRestController {
    @Autowired
    TaskFactory tasks;
    @GetMapping("/task/{id}")
    public List<Task> task(@PathVariable(value="id") int id) {
      List<Task> list = new ArrayList<>();
      list.add(new Task(id,tasks.get(id)));
      return list;
    }
    @GetMapping("/task")
    public List<Task> getAllTask()
    {
        return tasks.getAllTasks();
    }
}

