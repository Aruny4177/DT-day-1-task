package com.niit.Daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.SupplierDao;
import com.niit.model.Supplier;

@Repository("SupplierDao")
@Transactional
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void insertsupplier(Supplier supplier) {
		
		session.getCurrentSession().persist(supplier);
		
	}

	@Override
	public void  supDelete(int ID) {
		session.getCurrentSession().delete(getSupByid(ID));

	}
	@Override
	public Supplier getSupByid(int supId) {
		// if you'll use load method their

				Supplier p = session.getCurrentSession().get(Supplier.class, new Integer(supId));
				// Product p = (Product) session1.load(Product.class, new Integer(id));

				return p;
	}

	
}
