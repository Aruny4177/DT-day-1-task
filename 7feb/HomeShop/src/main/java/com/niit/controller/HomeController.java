package com.niit.controller;

import java.security.Principal;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.UserDao;
import com.niit.model.User;

@Controller
public class HomeController {
	@Autowired
	UserDao userdao;
@RequestMapping("/")
public ModelAndView HOme()
{
	ModelAndView obj= new ModelAndView("index");
	return obj;
}

@RequestMapping("/Login")
public String Loginpage(Principal principal, Model model){
		 User customer = userdao.getUserDetails(principal.getName());
		 model.addAttribute("customer", customer);
		return "Login";
}

@RequestMapping("/register")
public ModelAndView Reg()
{
	User obj1 = new User();
	ModelAndView obj=new ModelAndView("register");
	obj.addObject("u", obj1);
	return obj;
}
@RequestMapping(value="/save" , method=RequestMethod.POST)
public ModelAndView Res1(User u)
{
	ModelAndView andView = new ModelAndView("login");
    userdao.insertUser(u);
	return	andView; 
}
}
