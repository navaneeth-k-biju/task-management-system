package com.luminar.service;

import com.luminar.entity.Task;

public interface TaskService {

    public Task saveTask(Task task);

    public void deleteTask(Long id);
}
