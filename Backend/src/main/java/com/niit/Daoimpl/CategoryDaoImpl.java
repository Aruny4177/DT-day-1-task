package com.niit.Daoimpl;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.CategoryDao;
import com.niit.model.Category;
import com.niit.model.Supplier;


@Repository("CategoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao{

	@Autowired
	private SessionFactory session;


	
	@Override
	public void insercategory(Category category) {
		
		session.getCurrentSession().persist(category);
		
	}

	@Override
	public Category getCategoryDeatils(int ID) {
		Category c = session.getCurrentSession().get(Category.class, new Integer(ID));	
		return c;
	}

	@Override
	public List<Category> getAllCategory() {
		return session.getCurrentSession().createQuery("from Category").list();

	}


	@Override
	public void deleteCategoryById(int catId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategory(Category cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category getCategoryById(int catId) {
		// TODO Auto-generated method stub
		return null;
	}


}
