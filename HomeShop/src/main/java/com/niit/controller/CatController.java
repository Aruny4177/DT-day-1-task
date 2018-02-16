package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.CategoryDao;
import com.niit.model.Category;

@Controller
public class CatController {
@Autowired
CategoryDao catdao;
@RequestMapping("/getAllCat")
public ModelAndView Suppli()
{
	
	ModelAndView cat=new ModelAndView("catdispaly");

	cat.addObject("P",catdao.getAllCategory());
	//model.addAttribute("P",cdao.getAllCategory());
	return cat;
}
@RequestMapping(value="/Addcat",method=RequestMethod.POST )
public ModelAndView AddCat(Category ca)
{
Category cat1= new Category();
	ModelAndView cat=new ModelAndView("category");
	cat.addObject("cat",cat1);
	catdao.insercategory(ca);
	
	return cat;
}

}
