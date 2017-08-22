package com.rdm.servie;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Propagation;  
import org.springframework.transaction.annotation.Transactional;

import com.rdm.dao.UserDao;
import com.rdm.model.UserInfo;  


@Service  
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)  
public class UserServiceImpl implements UserService{

	@Autowired  
    UserDao userDao;  
	public void addUser(UserInfo user) {
	    userDao.saveUser(user);  
		
	}

	public List<UserInfo> getUser() {
		// TODO Auto-generated method stub
		return userDao.getUser();  
	}

}
