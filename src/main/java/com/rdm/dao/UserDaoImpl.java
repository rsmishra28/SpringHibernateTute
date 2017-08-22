package com.rdm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rdm.model.UserInfo;
import org.hibernate.SessionFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	 @Autowired  
	    private SessionFactory sessionfactory;  
	 
	 
	    
	
	 @Transactional  
	public List<UserInfo> getUser() {
		// TODO Auto-generated method stub
		  List<UserInfo> userlist = sessionfactory.getCurrentSession()  
	                .createCriteria(UserInfo.class).list();  
	        return userlist;  
	}

	@Transactional
	public void saveUser(UserInfo user) {
		// TODO Auto-generated method stub
		  sessionfactory.getCurrentSession().saveOrUpdate(user);  
	}

}
