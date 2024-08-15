package com.registration.Employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.Employee.dao.RegistrationDao;
import com.registration.Employee.entity.Employee;

@Service
public class RegistrationService {
	
	@Autowired
	RegistrationDao rd;
	
	public String insertdata(Employee emp) {
		return rd.insertdata(emp);
	}
	
	public Employee updatedata(Employee emp) {
		return rd.updatedata(emp);
	}
//	public void deletedata(int id) {
//		return;
//	}

}
