package com.luminar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.entity.Task;
import com.luminar.entity.User;
import com.luminar.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{
	@Autowired
    private TaskRepository taskRepo;
	
	public List<Task> getTasksByUser(User user) {
        return taskRepo.findByUser(user);
    }

    public Task saveTask(Task task) {
        return taskRepo.save(task);
    }

    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }
}
