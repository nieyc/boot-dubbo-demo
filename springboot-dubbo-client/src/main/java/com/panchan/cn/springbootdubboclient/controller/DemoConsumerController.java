package com.panchan.cn.springbootdubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.panchan.api.service.DemoService;
//import com.panchan.cn.metro.pojo.AppVersion;
//import com.panchan.cn.metro.sei.IAppVersionService;
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


    //@Reference
    //private IAppVersionService appVersionService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        logger.debug("name in methord sayHello:"+name);
        return demoService.sayHello(name);
    }

    /**
     * 调用gy-core 提供的接口
     * @param type
     * @return
     */
    /*@RequestMapping("/getVersion")
    public Object getVersion(String type) {
        AppVersion appVersion = null;
        try {
            appVersion = appVersionService.getAppVersionByType(type);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return appVersion;
    }*/
}
