package com.techleads.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techleads.app.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
