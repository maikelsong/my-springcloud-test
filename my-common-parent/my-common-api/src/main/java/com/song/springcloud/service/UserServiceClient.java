/*
 * Copyright (C), 2013-2019, 上汽集团
 * FileName: UserServiceClient.java
 * Author:   raolesong
 * Date:     2019年7月12日 上午11:20:40
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.song.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.song.springcloud.entity.User;

/**
 * 〈功能详细描述〉
 * @author raolesong
 * 2019年7月12日 上午11:20:40
 */
@FeignClient(value="order-service-provider") //注意小写
public interface UserServiceClient {
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
    public User findById(@PathVariable(value = "id")int id)  ;
    
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public List<User>findAll(@RequestParam(value="user")User user)  ;
	
    @RequestMapping(value="/user",method=RequestMethod.POST)
	public Boolean update(@RequestBody User user)  ;
    
    @RequestMapping(value="/user",method=RequestMethod.PUT)
	public Boolean save(@RequestBody User user)  ;
    
    @RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
    public Boolean delete(@PathVariable(value="id")int id) ;
 
}
