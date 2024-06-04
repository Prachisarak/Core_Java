package com.app.core;

public class Cricketer {
	 private int criketerId;
     private String name;
     private  int age;
     private String email_id;
     private String phone_no;
     private int rating;
     private static int idGenerator = 1000;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getCriketerId() {
		return criketerId;
	}
	public void setCriketerId(int criketerId) {
		this.criketerId = criketerId;
	}
	public static int getIdGenerator() {
		return idGenerator;
	}
	public static void setIdGenerator(int idGenerator) {
		Cricketer.idGenerator = idGenerator;
	}
	public Cricketer( String name, int age, String email_id, String phone_no, int rating) {
		super();
		
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.phone_no = phone_no;
		this.rating = rating;
		this.criketerId = ++idGenerator;
	}
	@Override
	public String toString() {
		return "Cricketer [criketerId=" + criketerId + ", name=" + name + ", age=" + age + ", email_id=" + email_id
				+ ", phone_no=" + phone_no + ", rating=" + rating + "]";
	}
	
	
	
     
     
     
     
     
}
