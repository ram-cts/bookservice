package com.core.student;

/**
 * Hello world!
 *
 */
public class StudentPojo {
	private String name;
	private String address;
	private StudentEntity entity;

public StudentEntity getEntity() {
		return entity;
	}

	public void setEntity(StudentEntity entity) {
		this.entity = entity;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
	public String getAddress() {
		return address;
	}

	public StudentPojo(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public StudentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
