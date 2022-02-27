package com.tsswebapps.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("todo-list")
public class TodoController {

	@GetMapping("/resumo")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
