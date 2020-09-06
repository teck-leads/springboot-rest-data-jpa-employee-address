package com.techleads.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.techleads.app.model.Users;
@Repository
@Transactional
public class UserRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	public Users saveUser(Users user) {
		entityManager.persist(user);
		return user;
	}

}
