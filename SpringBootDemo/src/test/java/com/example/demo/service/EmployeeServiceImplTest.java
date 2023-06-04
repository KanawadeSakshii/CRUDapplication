package com.example.demo.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplTest {

	@InjectMocks
	private EmployeeService employeeservice;
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	public void saveEmployee() {
		Employee emp=new Employee(102, "sakshi", "pune");
	      
		when(employeeRepository.save(emp)).thenReturn(emp);
	assertEquals(emp,employeeservice.saveEmployee(emp));
	
	}
	@Test
	public void getListByCity() {
	List<Employee> list=new ArrayList<>();
	list.add(new Employee(102, "sakshi", "pune"));
	list.add(new Employee(103, "pinki", "pune"));

	when(employeeRepository.findByCity("pune")).thenReturn(list);
	assertEquals(list, employeeservice.getListByCity("pune"));
	}
	
}
