package com.niit.controller;

import javax.enterprise.inject.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.CategoryDao;
import com.niit.Dao.ProductDao;
import com.niit.Dao.SupplierDao;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;

@Controller
public class AdminController {
	@Autowired
    CategoryDao cardao;
	@Autowired
	SupplierDao supdao;
	@Autowired
	ProductDao prodao;
@RequestMapping("/Product")
public ModelAndView Product()
{
	Product pro=new Product();
	ModelAndView andView = new ModelAndView("product");
	andView.addObject("p",pro);
	return andView;
}
@RequestMapping(value="/AddPro",method=RequestMethod.POST )
public ModelAndView AddPro(Product p)
{
	Product pro=new Product();
	ModelAndView pro1=new ModelAndView("product");
	pro1.addObject("pro",pro);
	prodao.insertproduct(pro);
	return pro1;
}



@RequestMapping("/category")
public ModelAndView Category()
{
	Category cat1= new Category();
	ModelAndView cat=new ModelAndView("category");
	cat.addObject("cat",cat1);
	return cat;
}



@RequestMapping("/supplier")
public ModelAndView Supplier()
{
	Supplier sup= new Supplier();
	ModelAndView sup1=new ModelAndView("supplier");
	sup1.addObject("sup",sup);
	return sup1;
}

@RequestMapping(value="/AddSup",method=RequestMethod.POST )
public ModelAndView AddSup(Supplier su)
{
	Supplier sup= new Supplier();
	ModelAndView sup1=new ModelAndView("supplier");
	sup1.addObject("sup",sup);
	supdao.insertsupplier(su);
	
	return sup1;
}


}
