package com.aakash.bankingapplication.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OpenAccount {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String title;
	private String firstname;
	private String middlename;
	private String lastname;
	private String fathersname;
	private int mobile;
	private String email;
	private String aadhar;
	private Date dob;
	private String address;
	private String city;
	private String accno;
}