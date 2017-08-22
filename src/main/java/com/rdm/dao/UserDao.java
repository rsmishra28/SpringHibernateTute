package com.rdm.dao;

import java.util.List;

import com.rdm.model.UserInfo;

public interface  UserDao {
	public void saveUser ( UserInfo user );  
	public List<UserInfo> getUser(); 
}
