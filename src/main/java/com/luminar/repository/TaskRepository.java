package com.luminar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.luminar.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
