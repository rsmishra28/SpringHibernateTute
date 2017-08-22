package com.rdm.servie;

import java.util.List;

import com.rdm.model.UserInfo;

public interface  UserService {
    public void addUser(UserInfo user);  
    public List<UserInfo> getUser();  
}
