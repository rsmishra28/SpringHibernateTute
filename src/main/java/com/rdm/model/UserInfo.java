package com.rdm.model;


import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity  
@Table(name = "tbl_userinfo") 
public class UserInfo {
    @Id  
    @GeneratedValue  
    @Column(name = "user_id")
	private int userid;
    
    @Column(name = "first_name")  
    private String firstName;
    
    @Column(name = "last_name")  
    private String lastName;
    
    @Column(name = "user_email")  
    private String email;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
