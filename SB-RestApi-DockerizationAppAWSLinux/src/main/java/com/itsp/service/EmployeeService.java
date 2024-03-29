package com.itsp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itsp.model.EmployeeModel;
import com.itsp.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public String saveEmployee(EmployeeModel model) {
		return repo.employeeRepo(model);
	}
	
	public List<Object> getAll(){
		return repo.getAllEmployee();
	}

}
