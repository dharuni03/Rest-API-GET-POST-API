package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model;
import com.example.demo.service.service;


@RestController
public class controller {
	@Autowired //extends another class
         service stuService;
	
	@PostMapping("/addDetails")
	
	public model addInfo(@RequestBody model st) {
		return stuService.saveDetails(st);
	}
	@GetMapping("/showDetails")
	public List<model>fetchDetails(){
		return stuService.getDetails();
	}
	@PutMapping("/updateDetails")
	public model updateInfo(@RequestBody model st1) {
		return stuService.updateDetails(st1);
	}
	@DeleteMapping("/deleteDetails/{stuid}")
	public String deleteInfo(@PathVariable("stuid") int stuid)
	{
		stuService.deleteDetails(stuid);
		return "Deleted details";
	}
}