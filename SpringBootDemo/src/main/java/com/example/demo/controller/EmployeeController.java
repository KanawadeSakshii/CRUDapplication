package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee") // to map this class url- http://localhost:8080/employee
public class EmployeeController {

	@Autowired //secondry type so Autowire for inject it 
    private EmployeeService employeeService;

     @PostMapping("/save") // for save so post http://localhost:8080/employee/save
      public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
	
	  //requestbody is for bulk of information comes from user
	   //ResponseEntity is predefine class of spring it use if u returning the any class or obj
	
	Employee emp=employeeService.saveEmployee(employee);
	return ResponseEntity.ok().body(emp);}
		  
		  //ok() is the for 200 means succefully emp id 
		  //body() for contain of obj like id,name,city
		 
	 @GetMapping("/get/{id}") //path variable // http://localhost:8080/employee/get/1
	 public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id ){
 	 Employee employee =employeeService.getEmployeeById(id);
	 return ResponseEntity.ok().body(employee);}
		
	 @DeleteMapping("/delete/{id}")// http://localhost:8080/employee/delete/2
	 public String deleteEmployeeById(@PathVariable("id")Integer id) throws Exception{
	 employeeService.deleteEmployee(id);
	 return "deleted successfully";
		 }
	     
	  @GetMapping("/getEmployeecity/{city}")  // http://localhost:8080/employee/getEmployeecity/pune
	  public ResponseEntity<List<Employee>> getEmployeeByCity(@PathVariable("city") String city){
	  List<Employee> emp=employeeService.getListByCity(city);
	  return ResponseEntity.ok().body(emp);
		}
	  
	  @PutMapping("/updateEmp") //http://localhost:8080/employee/updateEmp
	  public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		  Employee emp=employeeService.updateEmployee(employee);
			return ResponseEntity.ok().body(emp);
			}
	  
}	

