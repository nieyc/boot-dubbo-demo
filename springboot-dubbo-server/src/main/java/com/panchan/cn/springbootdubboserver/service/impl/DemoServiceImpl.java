package com.panchan.cn.springbootdubboserver.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.panchan.api.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author:nieyc
 * @company:panchan
 * @Date:created in 16:08 2019/1/29
 * @Description
 **/

@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    private Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
        logger.debug("sayhello，i am server:"+name);
        return "Hello, " + name + " (from Spring Boot)";
    }
}
