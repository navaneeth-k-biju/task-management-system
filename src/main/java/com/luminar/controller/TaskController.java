package com.luminar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.luminar.entity.Task;
import com.luminar.service.TaskService;

@Controller
public class TaskController {

	@Autowired
	TaskService taskService;
	
	@GetMapping("/tasks")
    public String viewTasks(Model model) {
        List<Task> tasks = taskService.getTasksByUser(getLoggedInUser());
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

	@GetMapping("/add")
	public String showForm(Model model) {
		model.addAttribute("task", new Task());
		return "task-form";
	}

	@PostMapping("/save")
	public String saveTask(@ModelAttribute Task task) {
		taskService.saveTask(task);
		return "redirect:/tasks";
	}

	@GetMapping("/delete/{id}")
	public String deleteTask(@PathVariable Long id) {
		taskService.deleteTask(id);
		return "redirect:/tasks";
	}
}
