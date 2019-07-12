package com.song.springcloud.controller;
 
 
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.song.springcloud.entity.User;

 
 
@RestController
public class UserController_ribbon {
	
	@Autowired
	private RestTemplate restTemplate;
    
    @RequestMapping(value="/user0",method=RequestMethod.GET)
	public List<User> findAll(User user) {
    	return this.restTemplate.getForObject("http://ORDER-SERVICE-PROVIDER/user", List.class);
	}
		
 
}