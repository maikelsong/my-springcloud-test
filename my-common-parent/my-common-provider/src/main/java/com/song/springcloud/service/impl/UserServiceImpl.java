package com.song.springcloud.service.impl;
import java.util.List;
 



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.song.springcloud.dao.UserDao;
import com.song.springcloud.entity.User;
import com.song.springcloud.service.UserService;
 
 
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
 
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}
 
	public List<User> findAll(User user) {
		// TODO Auto-generated method stub
		return userDao.findAll(user);
	}
 
	public Boolean update(User user) {
		// TODO Auto-generated method stub
		return userDao.update(user);
	}
 
	public Boolean save(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}
 
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}
 
}
