package com.techleads.app.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
		
		Employee emp1=new Employee();
		LocalDate date = LocalDate.of(1995, 9, 25);
		emp1.setName("madhav");
		emp1.setDateOfBirth(date);
		
		Employee emp2=new Employee();
		 date = LocalDate.of(1995, 10, 12);
		 emp2.setName("teja");
		 emp2.setDateOfBirth(date);
		 emp2.setAddress(Arrays.asList(new Address("Elite Hills", "Road No 10", "Hyderabad", "Home")));
		 employeeService.saveEmployee(emp2);
		 
		Address homeAddrs=new Address();
		homeAddrs.setAddrLineOne("VV Nagar");
		homeAddrs.setAddrLineTwo("Road No 10");
		homeAddrs.setCity("Hyderabad");
		homeAddrs.setAddressType("HOME");
		
		Address officeAddrs=new Address();
		officeAddrs.setAddrLineOne("DLF");
		officeAddrs.setAddrLineTwo("Synergy Park ODC 6");
		officeAddrs.setCity("Hyderabad");
		officeAddrs.setAddressType("Office");
		
		
		
		List<Address> addrsList=new ArrayList<>();
		addrsList.add(homeAddrs);
		addrsList.add(officeAddrs);
		
		emp1.setAddress(addrsList);
		
		Employee saveEmployee = employeeService.saveEmployee(emp1);
		logger.info("Employee {saved}=> "+saveEmployee);
		
		List<Employee> findAllEmps = employeeService.findAllEmps();
		
		logger.info("Employee {findAll}=> "+findAllEmps);
		
		logger.info("Employee {findById}=> "+employeeService.findEmpById(101));
		
		
	}

}
