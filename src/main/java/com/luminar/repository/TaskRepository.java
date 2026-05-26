package com.luminar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luminar.entity.Task;
import com.luminar.entity.User;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
	List<Task> findByUser(User user);
}
