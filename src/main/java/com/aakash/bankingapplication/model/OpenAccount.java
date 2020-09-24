package com.aakash.bankingapplication.model;

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

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Entity
@Table(name="open_account")
public class OpenAccount {
	public OpenAccount() {}
	public OpenAccount(int id, String title, @NotEmpty(message = "Please provide your First Name") String firstname,
			String middlename, @NotEmpty(message = "Please provide your Last Name") String lastname,
			@NotEmpty(message = "Please provide your Father's Name") String fathersname,
			@Min(10) @Max(10) @NotEmpty(message = "Please provide your mobile Number") String mobile,
			@Email(message = "Please provide a valid e-mail") @NotEmpty(message = "Please provide your email Id") String email,
			@NotEmpty(message = "Please provide your Aadhar Number") @NotNull String aadhar,
			@Past @NotEmpty(message = "Please provide your Birth date") String dob, String address, String city,
			@NotNull String accno) {
		super();
		this.id = id;
		this.title = title;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.fathersname = fathersname;
		this.mobile = mobile;
		this.email = email;
		this.aadhar = aadhar;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.accno = accno;
	}
	@Override
	public String toString() {
		return "OpenAccount [id=" + id + ", title=" + title + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", fathersname=" + fathersname + ", mobile=" + mobile + ", email=" + email
				+ ", aadhar=" + aadhar + ", dob=" + dob + ", address=" + address + ", city=" + city + ", accno=" + accno
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFathersname() {
		return fathersname;
	}
	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="title")
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
	private String mobile;
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
	@DateTimeFormat(pattern="dd/mm/yyyy")
	private String dob;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="account_number")
	@NotNull
	private String accno;
}