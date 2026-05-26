package com.luminar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.entity.Task;
import com.luminar.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{
	@Autowired
    private TaskRepository taskRepo;

    public Task saveTask(Task task) {
        return taskRepo.save(task);
    }

    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }
}
