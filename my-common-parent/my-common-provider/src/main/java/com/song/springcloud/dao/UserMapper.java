package com.song.springcloud.dao;
import java.util.List;
 

import org.apache.ibatis.annotations.Mapper;

import com.song.springcloud.entity.User;
 
 
@Mapper
public interface UserMapper {
	
	public User findById(int id);
	
	public List<User>findAll(User user);
	
	public Boolean update(User user);
	
	public Boolean save(User user);
	
	public Boolean delete(int  id);
   
}

