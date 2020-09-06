package com.techleads.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techleads.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
