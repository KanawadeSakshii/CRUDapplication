package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository //this annotation is for to exending the exiting repository of the hibernate
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
//JpaRepository it the exiting repository of hibernate	
//EmployeeRepository , JpaRepository is an interface in JpaRepository many method are available
	// Employee is the class name
	//Integer is the ID is in inegere
	
	@Query(value="select * from employee c where city=?",nativeQuery=true)
	List<Employee> findByCity(String city);
}
