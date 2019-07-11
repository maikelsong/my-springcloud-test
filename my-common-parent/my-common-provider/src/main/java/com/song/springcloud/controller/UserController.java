package com.song.springcloud.controller;
 
 
 
import java.util.List;
 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.song.springcloud.entity.User;
import com.song.springcloud.service.UserService;
 
 
@RestController
public class UserController {
	
	   @Autowired
	   UserService userService;
	   
	    @RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	    public User findById(@PathVariable(value="id")int id) {
	    	
			return userService.findById(id);
		}
	    
	    @RequestMapping(value="/user",method=RequestMethod.GET)
		public List<User>findAll(User user) {
			
			return userService.findAll(user);
		}
		
	    @RequestMapping(value="/user",method=RequestMethod.POST)
		public Boolean update(@RequestBody User user) {
			return userService.update(user);
		}
	    @RequestMapping(value="/user",method=RequestMethod.PUT)
		public Boolean save(@RequestBody User user) {
	    	
			return userService.save(user);
		}
	    @RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
	    	public Boolean delete(@PathVariable(value="id")int id) {
				return userService.delete(id);
			}
	    }
 
 