package com.itsp.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itsp.model.EmployeeModel;

@Repository
public class EmployeeRepo {
	
	List<Object> mapRepo = new ArrayList<Object>();
	
	public String employeeRepo(EmployeeModel model) {
		Object obj = mapRepo.add( model);
		if(obj!=null) {
			return "success";
		}else {
			return "false";
		}
	}
	
	public List<Object> getAllEmployee(){
		return mapRepo;
	}

}
