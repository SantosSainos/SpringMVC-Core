package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springmvc.pojo.Admin;
import com.springmvc.service.AdminService;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @version 1.0
 */

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;

	@RequestMapping("/admin")
	public String showAdmin(Model model, @ModelAttribute("resultado")String resultado) {
		
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		model.addAttribute("resultadi", resultado);
		
		return "admin";
	}
	
	@RequestMapping(value="/admin/save", method=RequestMethod.POST)
	public String handleAdmin(@ModelAttribute("admin") Admin adminForm, Model model,
			RedirectAttributes ra) {
		
		if (adminService.save(adminForm)) {
			ra.addAttribute("resultado", "Cambios realizados con éxito");			
		} else {
			ra.addAttribute("resultado", "Error al realizar los cambios");						
		}
		
		
		return "redirect:/admin";
	}
}
