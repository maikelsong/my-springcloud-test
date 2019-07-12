package com.song.springcloud.controller;
 
 
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.song.springcloud.entity.User;
import com.song.springcloud.service.UserServiceClient;

 
 
@RestController
public class UserController_feign {
	
	@Autowired
	private UserServiceClient userService;
    
    @RequestMapping(value="/user2",method=RequestMethod.GET)
	public List<User> findAll(User user) {
		
    	List list = this.userService.findAll(user);

		return list;
	}
		
 
}