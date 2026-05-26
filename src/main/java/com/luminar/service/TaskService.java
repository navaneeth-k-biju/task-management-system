package com.luminar.service;

import java.util.List;

import com.luminar.entity.Task;
import com.luminar.entity.User;

public interface TaskService {
	
	public List<Task> getTasksByUser(User user);
    

    public Task saveTask(Task task);

    public void deleteTask(Long id);
}
