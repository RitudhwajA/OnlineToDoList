/**
 * 
 */
package com.app.onlinetodolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.onlinetodolist.pojo.CustomTask;
import com.app.onlinetodolist.repository.TaskJdbcRepository;

/**
 * @author Ritudhwaj
 *
 */
@Controller
public class OnlineToDoListController {

	/**
	 * 
	 */
	public OnlineToDoListController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	TaskJdbcRepository repository;

	/*
	 * @PostConstruct public void init() throws Exception {
	 * repository.addTask(new CustomTask(1,"test1","test1",false));
	 * repository.addTask(new CustomTask(2,"test2","test2",false));
	 * repository.addTask(new CustomTask(3,"test3","test3",false));
	 * repository.addTask(new CustomTask(4,"test4","test4",false)); }
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "redirect:/customtask";
	}

	@RequestMapping(value = "/customtask", method = RequestMethod.GET)
	public String getAllTasks(Model model) {
		model.addAttribute("tasks", repository.getAllTasks());
		model.addAttribute("customtask", new CustomTask());
		return "index";
	}

	@RequestMapping(value = "/customtask", method = RequestMethod.POST, params = "action=save")
	public String createTask(@ModelAttribute CustomTask customTask) {
		repository.addTask(customTask);
		return "redirect:/customtask";
	}
	
	@RequestMapping(value = "/updatetask", method = RequestMethod.GET)
	public String updateTask(@RequestParam(name="id")String id) {
		repository.updateTask(Integer.parseInt(id));
		return "redirect:/customtask";
	}

	@RequestMapping(value = "/customtask", method = RequestMethod.POST, params = "action=cancel")
	public String cancel(@ModelAttribute CustomTask customTask) {
		return "redirect:/customtask";
	}

	@RequestMapping(value = "/deletetask", method = RequestMethod.GET)
	public String deleteTask(@RequestParam(name="id")String id) {
		repository.deleteTask(Integer.parseInt(id));
		return "redirect:/customtask";

	}

}
