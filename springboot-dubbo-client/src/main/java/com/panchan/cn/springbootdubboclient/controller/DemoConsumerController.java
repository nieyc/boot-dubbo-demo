package com.panchan.cn.springbootdubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.panchan.api.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:nieyc
 * @company:panchan
 * @Date:created in 16:19 2019/1/29
 * @Description
 **/

@RestController
public class DemoConsumerController {

    private  Logger logger = LoggerFactory.getLogger(DemoConsumerController.class);

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        logger.debug("name in methord sayHello:"+name);
        return demoService.sayHello(name);
    }
}
