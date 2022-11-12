package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	
	@RequestMapping("/list_contact")
	public String listContact(Model model) {
		ContractBusiness business = new ContractBusiness();
		List<Contact> contactList = business.getContactList();
		
		model.addAttribute("contacts", contactList);
		
		return "contact";
	}
	
	@RequestMapping("/list_student")
	public String listStudent(Model model) {
		StudentBusiness business = new StudentBusiness();
		List<Student> studentList = business.getStudentList();
		
		model.addAttribute("students",studentList);
		
		return "student";
	}
}
