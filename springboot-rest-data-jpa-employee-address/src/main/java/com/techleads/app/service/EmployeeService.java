package com.techleads.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techleads.app.model.Employee;
import com.techleads.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		Employee save = employeeRepository.save(employee);
		return save;
	}
	
	public List<Employee> findAllEmps(){
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}
	
	public Employee findEmpById(Integer id){
		Optional<Employee> findById = employeeRepository.findById(id);
		return findById.isPresent()?findById.get(): new Employee();
	}

}
