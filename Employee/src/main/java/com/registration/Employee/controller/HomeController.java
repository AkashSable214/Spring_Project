package com.registration.Employee.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.registration.Employee.entity.Employee;
import com.registration.Employee.service.RegistrationService;

@Controller
public class HomeController {
	
	@Autowired
	RegistrationService rs;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping("insert")
	public void insetdata(@ModelAttribute Employee emp) {
		
	}
	@RequestMapping("update")
	public void update(Employee emp) {
		
	}
	
//	@RequestMapping("delete")
//	public void daletedata(@RequestParam("id") int id,Employee emp){
//		emp.deletedata(id);
//		
//		
//		
//	}
	
}
