package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.CategoryDao;
import com.niit.Dao.SupplierDao;

@Controller
public class SupController {
	@Autowired
	SupplierDao supdao;
	@Autowired
	CategoryDao cdao;
@RequestMapping("/dele/{supid}")
public ModelAndView delesup(@PathVariable("supid")int id)
{
	ModelAndView obj = new ModelAndView("index");
	supdao.supDelete(id);
	return obj;
}

@RequestMapping("/getsubid/{subid}")
public ModelAndView getSubId(@PathVariable("subid")int id)
{
	ModelAndView obj=new ModelAndView("DisSubID");
	//List<String>subdata=supdao.getSupByid(id);
//obj.addObject("sub",subdata);
	return obj;
}






}
