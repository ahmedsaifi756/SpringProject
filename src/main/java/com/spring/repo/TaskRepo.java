package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.TaskDetails;

@Repository
public interface TaskRepo extends JpaRepository<TaskDetails, Integer> {

}
