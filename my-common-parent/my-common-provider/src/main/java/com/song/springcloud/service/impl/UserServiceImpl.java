package com.song.springcloud.service.impl;
import java.util.List;
 



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.song.springcloud.dao.UserMapper;
import com.song.springcloud.entity.User;
import com.song.springcloud.service.UserService;
 
 
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
 
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userMapper.findById(id);
	}
 
	public List<User> findAll(User user) {
		// TODO Auto-generated method stub
		return userMapper.findAll(user);
	}
 
	public Boolean update(User user) {
		// TODO Auto-generated method stub
		return userMapper.update(user);
	}
 
	public Boolean save(User user) {
		// TODO Auto-generated method stub
		return userMapper.save(user);
	}
 
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		return userMapper.delete(id);
	}
 
}
