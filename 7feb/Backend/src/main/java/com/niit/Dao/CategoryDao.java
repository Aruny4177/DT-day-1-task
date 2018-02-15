package com.niit.Dao;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDao {

	public void insercategory(Category category);
	public Category getCategoryDeatils(int ID);
	public List<Category> getAllCategory();
	public void deleteCategoryById(int catId);
	void updateCategory(Category cat);
	public Category getCategoryById(int catId);
	
}
