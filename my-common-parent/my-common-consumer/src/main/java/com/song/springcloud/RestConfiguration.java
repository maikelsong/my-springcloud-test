/*
 * Copyright (C), 2013-2019, 上汽集团
 * FileName: RestConfiguration.java
 * Author:   raolesong
 * Date:     2019年7月11日 下午3:46:56
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.song.springcloud;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 〈功能详细描述〉
 * @author raolesong
 * 2019年7月11日 下午3:46:56
 */
@Configuration
public class RestConfiguration {
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
