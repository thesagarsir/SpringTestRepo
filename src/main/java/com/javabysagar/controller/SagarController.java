package com.javabysagar.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabysagar.service.SagarService;

@RestController
public class SagarController {

	@Autowired
	SagarService sagarService;
	
	@RequestMapping("checkmyapp")
	String check() {
		return "Working..!!!";
	}
	@RequestMapping("listofallemployees")
	public Set<String> getAllEmployee() throws Exception {
		Set<String> listofEmp = sagarService.getAllEmploee();
		System.out.println("My Changes");
		return listofEmp;
	}
	
}
