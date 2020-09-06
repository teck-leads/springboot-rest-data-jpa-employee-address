package com.techleads.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techleads.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByName(String name);

}
