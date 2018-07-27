package com.siri.hsi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.siri.hsi.entity.FBUser;

@Repository
public class UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public FBUser getUserByID(Integer id) throws Exception{
		Session session = null;
		try {
		    session = sessionFactory.openSession();	
			session.beginTransaction();		
			FBUser user = session.get(FBUser.class, id);	
			session.getTransaction().commit();
			return user;
		} catch(Exception exe) {
			System.out.println("Exception in UserDAO.getUserByID() at " + System.currentTimeMillis() + " EXE Message : " + exe.getMessage());
			throw exe;
		}
		
		
		
	}
}
