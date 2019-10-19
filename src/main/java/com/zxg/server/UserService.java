package com.zxg.server;

import com.zxg.mapper.UserMapper;
import com.zxg.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
    @Transactional
    public void insertUser(User user){
        userMapper.insert(user);
    }
}
