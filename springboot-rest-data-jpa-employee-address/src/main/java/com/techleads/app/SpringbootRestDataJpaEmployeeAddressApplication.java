package com.techleads.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.techleads.app.repository.AddressRepository;
import com.techleads.app.repository.EmployeeRepository;
import com.techleads.app.repository.UserRepository;
@EnableJpaRepositories(basePackageClasses = {EmployeeRepository.class,UserRepository.class,AddressRepository.class})
@SpringBootApplication
public class SpringbootRestDataJpaEmployeeAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestDataJpaEmployeeAddressApplication.class, args);
	}

}
