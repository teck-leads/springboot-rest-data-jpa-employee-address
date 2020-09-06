package com.techleads.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
		
		Sort sortByName = Sort.by(Sort.Direction.DESC, "name");
		List<Employee> findAll = employeeRepository.findAll(sortByName);
		return findAll;
	}
	
	public Employee findEmpById(Integer id){
		Optional<Employee> findById = employeeRepository.findById(id);
		return findById.isPresent()?findById.get(): new Employee();
	}

}
