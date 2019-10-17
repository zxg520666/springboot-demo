package com.zxg.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author zhangxiaoguang
 * @createtime 2019/10/16-10:25
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/getUser.do")
    public String getUser(){
        //System.out.println("hello method is running");
        log.debug("hello method is running");
        return "user is student";
    }
}
