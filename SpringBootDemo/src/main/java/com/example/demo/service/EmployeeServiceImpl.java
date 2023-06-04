package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;
@Service // give this annotaion for impl cls of service to know our application that is service layer
public class EmployeeServiceImpl implements EmployeeService {
    
	@Autowired //(required=true) //Autowired becoz JpaRepository is interface of springframework application so our appliaction and springframework app is different sinario so  we autowire  
	private EmployeeRepository employeeRepository; //reference of EmployeeRepository for calling the method present in that
	
	//here for saving the data we do not call session.save()method so
	//so we need to design dao  layer first in that interface see above employeeRepository
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee); //save() method is method of jparepository
		// employeeRepository.save this is return to method
	}
	@Override
	public Employee getEmployeeById(Integer id) {
		return employeeRepository.findById(id).get();
}
	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		
	}
	@Override
	public List<Employee> getListByCity(String city) {
		List<Employee> listemp=employeeRepository.findByCity(city);
		return listemp;
}
	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
		 
	}
	
	
	
}



















