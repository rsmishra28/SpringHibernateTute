package com.rdm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.validation.BindingResult;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rdm.model.UserInfo;
import com.rdm.servie.UserService;

@Controller
public class UserController {
	  @Autowired  
	    private UserService userService;
	  
	  @RequestMapping(value ="/saveUser" ,  method = RequestMethod.POST)  
	    public ModelAndView saveUserData(@ModelAttribute("user") UserInfo user,  
	            BindingResult result) {  
				//Test first commit
		System.out.println("FN :"+user.getFirstName());
		  System.out.println("FN :"+user.getFirstName());
		  System.out.println("LN :"+user.getLastName());
		  System.out.println("EM :"+user.getEmail());
	        userService.addUser(user);  
	        System.out.println("Save User Data");  
	        return new ModelAndView("redirect:/adduserform.jsp");  
	  
	    }  
	  
	  @RequestMapping(value="/userList" , method= RequestMethod.GET)  
	    public ModelAndView getUserList() {  
	        List<UserInfo> list = userService.getUser();
	        System.out.println("View List" + list.size());
	         
	        ModelAndView mv = new ModelAndView();
	        
	        mv.addObject("list", list);
	        mv.setViewName("viewusers.jsp");
	        
	        return mv;  
	  
	    }  
}
