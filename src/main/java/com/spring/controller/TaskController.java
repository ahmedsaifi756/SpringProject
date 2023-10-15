package com.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.TaskDetails;
import com.spring.service.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/home")
	public String check() {
		return "Askm";
	}
	
	@PostMapping("/addTask")
	public TaskDetails addTask(@RequestBody TaskDetails taskDetails) {
		return taskService.saveTask(taskDetails);
	}
	
	@PostMapping("/addTaskList")
	public List<TaskDetails> addTaskList(@RequestBody List<TaskDetails> taskList){
		return taskService.saveTaskList(taskList);
	}
	
	@GetMapping("/getTaskById/{id}")
	public TaskDetails getTask(@PathVariable int id) {
		return taskService.getTaskById(id);
	}
	
	@GetMapping("/getAllTask")
	public List<TaskDetails> getAllTask(){
		return taskService.getAllTask();
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteTask(@PathVariable int id) {
		return taskService.deleteById(id);
	}
	@PutMapping("/updateTask")
	public TaskDetails updateTask(@RequestBody TaskDetails taskDetails) {
		return taskService.updateTask(taskDetails);
	}
}
