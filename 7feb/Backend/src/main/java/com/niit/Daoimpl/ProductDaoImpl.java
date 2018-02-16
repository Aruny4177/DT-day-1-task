package com.niit.Daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.ProductDao;
import com.niit.model.Product;

@Repository("ProductDao")
@Transactional
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory session;

	@Override
	public void insertproduct(Product product) {
		// TODO Auto-generated method stub
		session.getCurrentSession().persist(product);
		
		
	}

	@Override
	public Product getprodcutDeatils(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProdct(Product pro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getProdcutById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
