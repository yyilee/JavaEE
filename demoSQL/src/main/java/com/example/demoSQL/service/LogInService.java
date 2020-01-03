package com.example.demoSQL.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoSQL.domain.UserDo;

@Service
public class LogInService {
	@Autowired
    private UserDao userDao;
	
	public boolean validateUser(Long id, String password) {
		UserDo userDo = userDao.getOne(id);
		return userDo.getPwd().equals(password);
		
	}

}
