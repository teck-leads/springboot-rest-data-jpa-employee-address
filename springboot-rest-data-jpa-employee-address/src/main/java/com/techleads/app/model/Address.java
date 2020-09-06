package com.techleads.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Address")
@SequenceGenerator(name = "addrs_seq", initialValue = 1001, allocationSize = 1)
@ToString(exclude = {"employee"} )
public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addrs_seq")
	private Integer id;
	private String addrLineOne;
	private String addrLineTwo;
	private String city;
	private String addressType;
	@ManyToMany(mappedBy = "address",cascade=CascadeType.ALL)
	private List<Employee> employee=new ArrayList<>();
	public Address(String addrLineOne, String addrLineTwo, String city, String addressType) {
		this.addrLineOne = addrLineOne;
		this.addrLineTwo = addrLineTwo;
		this.city = city;
		this.addressType = addressType;
	}
	
	

}
