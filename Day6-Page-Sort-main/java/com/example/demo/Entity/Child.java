package com.example.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
  
@Entity
@Table(name="Children")
public class Child {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="babyid")
	private Long id;
	
	@Column(name = "babyFirstName")
	private String fname;
	
	@Column(name = "babyLastName")
	private String lname;
	
	@Column(name="fatherName")	
	private String dadname;
	
	@Column(name="motherName")
	private String momname;
	
	@Column(name = "address")
	private String address;
	
	public Child() {}
	
	

	public Child(Long id, String fname, String lname, String dadname, String momname, String address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dadname = dadname;
		this.momname = momname;
		this.address = address;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDadname() {
		return dadname;
	}

	public void setDadname(String dadname) {
		this.dadname = dadname;
	}

	public String getMomname() {
		return momname;
	}

	public void setMomname(String momname) {
		this.momname = momname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
	
