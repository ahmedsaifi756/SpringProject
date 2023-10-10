package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.TaskStatus;

@Repository
public interface StatusRepo extends JpaRepository<TaskStatus, Integer>{

}
