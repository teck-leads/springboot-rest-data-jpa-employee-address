package com.techleads.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techleads.app.model.Address;
import com.techleads.app.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;
	
	public Address saveAddress(Address address) {
		Address save = addressRepository.save(address);
		return save;
	}


}
