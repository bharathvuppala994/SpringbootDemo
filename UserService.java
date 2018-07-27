package com.siri.hsi.servicde;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siri.hsi.dao.UserDAO;
import com.siri.hsi.entity.FBUser;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDao;
	
	public FBUser getUserById(Integer id) throws Exception {
		try {
			return userDao.getUserByID(id);
		} catch (Exception exe) {
			System.out.println("Exception in UserService.getUserByID() at " + System.currentTimeMillis() + " EXE Message : " + exe.getMessage());
			throw exe;
		}
	}

}
