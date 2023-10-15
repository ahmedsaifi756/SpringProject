package com.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.entity.TaskDetails;
import com.spring.repo.TaskRepo;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepo taskRepo;

	public TaskDetails saveTask(TaskDetails taskDetails) {
		return taskRepo.save(taskDetails);
	}

	public List<TaskDetails> saveTaskList(List<TaskDetails> taskList) {
		return taskRepo.saveAll(taskList);
	}

	public TaskDetails getTaskById(int id) {
		return taskRepo.findById(id).orElse(null);
	}

	public List<TaskDetails> getAllTask() {
		return taskRepo.findAll();
	}

	public String deleteById(int id) {
		taskRepo.deleteById(id);
		return "task deteled of id: "+id;
	}

	public TaskDetails updateTask(TaskDetails taskDetails) {
		TaskDetails exisDetails = taskRepo.findById(taskDetails.getId()).orElse(null);
		exisDetails.setId(taskDetails.getId());
		exisDetails.setDescription(taskDetails.getDescription());
		exisDetails.setTitle(taskDetails.getTitle());
		exisDetails.setTaskStatus(taskDetails.getTaskStatus());
		return taskRepo.save(exisDetails);		
	}
	
	

}
