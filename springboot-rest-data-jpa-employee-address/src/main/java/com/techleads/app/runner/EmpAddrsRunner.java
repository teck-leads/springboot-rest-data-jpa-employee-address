package com.techleads.app.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.techleads.app.model.Address;
import com.techleads.app.model.Employee;
import com.techleads.app.service.AddressService;
import com.techleads.app.service.EmployeeService;
@Component
@Transactional
public class EmpAddrsRunner implements CommandLineRunner {
	

	Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private AddressService addressService;
	@Override
	public void run(String... args) throws Exception {
		
		Employee employee=new Employee();
		LocalDate date = LocalDate.of(1995, 9, 25);
		employee.setName("madhav");
		employee.setDateOfBirth(date);
		
		
		Address addrs=new Address();
		addrs.setAddrLineOne("VV Nagar");
		addrs.setAddrLineTwo("Road No 10");
		addrs.setCity("Hyderabad");
		
		List<Address> addrsList=new ArrayList<>();
		addrsList.add(addrs);
		
		employee.setAddress(addrsList);
		
		Employee saveEmployee = employeeService.saveEmployee(employee);
		logger.info("Employee {saved}=> "+saveEmployee);
		
		List<Employee> findAllEmps = employeeService.findAllEmps();
		
		logger.info("Employee {findAll}=> "+findAllEmps);
		
		logger.info("Employee {findById}=> "+employeeService.findEmpById(101));
		
		
	}

}
