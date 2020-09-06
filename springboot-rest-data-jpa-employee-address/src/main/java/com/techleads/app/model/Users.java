package com.techleads.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;	

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
@SequenceGenerator(name = "user_seq", initialValue = 101, allocationSize = 1)
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	private Integer id;
	private String name;
	private String role;

}
