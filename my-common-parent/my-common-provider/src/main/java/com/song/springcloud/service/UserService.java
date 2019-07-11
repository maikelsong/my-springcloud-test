package com.song.springcloud.service;
import java.util.List;

import com.song.springcloud.entity.User;
 
 
public interface UserService {
	
    public User findById(int id);
	
	public List<User>findAll(User user);
	
	public Boolean update(User user);
	
	public Boolean save(User user);
	
	public Boolean delete(int  id);
 
}
