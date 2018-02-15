package com.niit.Daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.UserDao;
import com.niit.model.User;

@Repository("UserDao")
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void insertUser(User user) {
		session.getCurrentSession().persist(user);
	}

	@Override
	public User getUserDetails(String email) {

return null;
	}
	
}
