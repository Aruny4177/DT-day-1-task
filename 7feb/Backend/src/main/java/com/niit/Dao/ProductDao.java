package com.niit.Dao;

import java.util.List;

import com.niit.model.Product;



public interface ProductDao {
	
	public void insertproduct(Product product);
	public Product getprodcutDeatils(int id);
	public List<Product> getAllProduct();
	public void deleteProductById(int id);
	void updateProdct(Product pro);
	public Product getProdcutById(int id);
	

}
