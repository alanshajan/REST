package com.example.REST.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.REST.model.user_manager;
import com.example.REST.repository.user_manager_repository;

@RestController
public class user_manager_resource {
	
	@Autowired
	user_manager_repository u_m_r;
	
	@RequestMapping(value="/user_manager")
	public List<user_manager> getAll(){
		return u_m_r.findAll();
	}
	
}
