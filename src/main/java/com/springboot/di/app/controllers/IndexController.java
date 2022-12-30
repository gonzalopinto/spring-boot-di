package com.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.di.app.services.IMyService;

@Controller
public class IndexController {

	@Autowired
	//@Qualifier("complexService")
	private IMyService myService; 
	
	@GetMapping({"/index", "", "/"})
	public String index(Model model) {
		model.addAttribute("objeto", myService.operacion());
		return "index";
	}
}
