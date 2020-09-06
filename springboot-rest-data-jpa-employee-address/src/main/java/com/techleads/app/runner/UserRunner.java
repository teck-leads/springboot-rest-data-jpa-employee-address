package com.techleads.app.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.techleads.app.model.Users;
import com.techleads.app.repository.UserRepository;
//@Component
public class UserRunner implements CommandLineRunner {

	Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserRepository UserRepository;
	@Override
	public void run(String... args) throws Exception {

		Users user=new Users();
		user.setName("madhav");
		user.setRole("EMP");
		Users saveUser = UserRepository.saveUser(user);
		logger.info(saveUser.toString());
		//System.exit(0);
		
	}

}
