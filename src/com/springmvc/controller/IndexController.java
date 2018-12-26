package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @version 1.0
 */
 
@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	@RequestMapping("/about")
	public String showAbout() {
		return "about";
	}

}
