package com.panchan.cn.springbootdubboclient;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author:nieyc
 * @company:panchan
 * @Date:created in 16:08 2019/1/29
 * @Description
 **/
@EnableDubbo
@SpringBootApplication
public class SpringbootDubboClientApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringbootDubboClientApplication.class);

	public static void main(String[] args) {
		logger.info("dubbo-client start");
		SpringApplication.run(SpringbootDubboClientApplication.class, args);
	}

}

