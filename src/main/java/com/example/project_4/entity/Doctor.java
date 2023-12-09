package com.example.project_4.entity;

public class Doctor {
	
	private int id;
	private String fullNameDoc;
	private String dateOfBirth;
	private String qualification;
	private String specialist;
	private String email;
	private String phone;
	private String password;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(String fullNameDoc, String dateOfBirth, String qualification, String specialist, String email,
			String phone, String password) {
		super();
		this.fullNameDoc = fullNameDoc;
		this.dateOfBirth = dateOfBirth;
		this.qualification = qualification;
		this.specialist = specialist;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	
	


	public Doctor(int id, String fullNameDoc, String dateOfBirth, String qualification, String specialist, String email,
			String phone, String password) {
		super();
		this.id = id;
		this.fullNameDoc = fullNameDoc;
		this.dateOfBirth = dateOfBirth;
		this.qualification = qualification;
		this.specialist = specialist;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}


	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullNameDoc() {
		return fullNameDoc;
	}


	public void setFullNameDoc(String fullNameDoc) {
		this.fullNameDoc = fullNameDoc;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getSpecialist() {
		return specialist;
	}


	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Object getFullName() {
		return this.getFullNameDoc();
	}
}
