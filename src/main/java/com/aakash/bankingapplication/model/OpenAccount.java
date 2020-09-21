package com.aakash.bankingapplication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="open_account")
@Data
public class OpenAccount {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="title")
	@NotEmpty(message = "Please provide your title/TITLE KIDHAR HAI?")
	private String title;
	@Column(name="first_name")
	@NotEmpty(message = "Please provide your First Name")
	private String firstname;
	@Column(name="middle_name")
	private String middlename;
	@Column(name="last_name")
	@NotEmpty(message = "Please provide your Last Name")
	private String lastname;
	@Column(name="fathers_name")
	@NotEmpty(message = "Please provide your Father's Name")
	private String fathersname;
	@Column(name="mobile_number")
	@Min(10)
	@Max(10)
	@NotEmpty(message = "Please provide your mobile Number")
	private int mobile;
	@Column(name="email_id")
	@Email(message = "Please provide a valid e-mail")
	@NotEmpty(message = "Please provide your email Id")
	private String email;
	@Column(name="aadhar_number")
	@NotEmpty(message = "Please provide your Aadhar Number")
	@NotNull
	private String aadhar;
	@Column(name="dob")
	@Past
	@NotEmpty(message = "Please provide your Birth date")
	private Date dob;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="account_number")
	@NotNull
	private String accno;
}