package com.zxg.controller;

import com.zxg.pojo.User;
import com.zxg.server.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Date;

/**
 * @author zhangxiaoguang
 * @createtime 2019/10/16-10:25
 */
@RestController
@Slf4j

public class UserController {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser.do")
    public String getUser(){
        //System.out.println("hello method is running");
        log.debug("hello method is running");
        return "user is student";
    }
    @RequestMapping("user/qeuryUser")
    public User qeuryUser(@RequestParam Long id){
        return  userService.queryById(id);
    }
    @RequestMapping("user/insertUser")
    public void insertUser(){
        User user=new User();
        user.setUserName("大美女");
        user.setAge(18);
        user.setBirthday(new Date());
        userService.insertUser(user);
    }
}
