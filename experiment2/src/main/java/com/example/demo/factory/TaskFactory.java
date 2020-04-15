package com.example.demo.factory;

import com.example.demo.model.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskFactory {

    public List<Task> getAllTasks()
    {
        List<Task> lists = new ArrayList<>();
        for(int i=1;i<10;i++)
        {
            lists.add(new Task(i,"YSRNB"));
        }
        return lists;
    }
    public String get(int id)
    {
        List<Task> list = getAllTasks();
        Task task = list.stream()
                .filter(x->x.getId()==id)
                .findFirst()
                .orElse(null);
        return task.getIntroduce();
    }
}
