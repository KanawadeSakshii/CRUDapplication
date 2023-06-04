package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.Employee;

public interface EmployeeService {
// here return type is employeee becoz we want employee data	
	//arguments is Object of employee because we are saving the whole employee data
public Employee saveEmployee(Employee employee);
public Employee getEmployeeById(Integer id); 
public void deleteEmployee(Integer id);
public List<Employee> getListByCity(String city);
public Employee updateEmployee(Employee employee);

	
}
