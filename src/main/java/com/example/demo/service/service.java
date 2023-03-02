package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.model;
import com.example.demo.repository.stRepo;

@Service
public class service {
	@Autowired //extends another class
    stRepo stRepo; //reference variable
	
	public model saveDetails(model e) {
		return stRepo.save(e);
	}
	public List<model> getDetails(){
		return stRepo.findAll();
	}
	public model updateDetails(model e1) {
		return stRepo.saveAndFlush(e1);
	}
	public void deleteDetails(int id)
	{
		stRepo.deleteById(id);
	}
	
}