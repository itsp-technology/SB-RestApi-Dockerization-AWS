package com.itsp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itsp.model.EmployeeModel;
import com.itsp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/empcreate")
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeModel model) {
		return new ResponseEntity(service.saveEmployee(model), HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<Map<Long,Object>> getAll(){
		return new ResponseEntity(service.getAll(),HttpStatus.OK);
	}
}
