package com.zxg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author zhangxiaoguang
 * @createtime 2019/10/16-10:25
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public String getUser(){
        return "user is student";
    }
}
