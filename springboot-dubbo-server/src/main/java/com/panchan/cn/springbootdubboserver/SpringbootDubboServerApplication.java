package com.panchan.cn.springbootdubboserver;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author:nieyc
 * @company:panchan
 * @Date:created in 16:08 2019/1/29
 * @Description
 **/

@EnableDubbo
@SpringBootApplication
public class SpringbootDubboServerApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringbootDubboServerApplication.class);

	public static void main(String[] args) {
		logger.debug("server start");
		SpringApplication.run(SpringbootDubboServerApplication.class, args);
	}

}

