package com.ggf.mybatisplusdemo.controller;


import com.ggf.mybatisplusdemo.entity.User;
import com.ggf.mybatisplusdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Descripton TODO
 * @Author: gqf
 * @create: 2019-05-31 17:44
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/selectList")
    public void selectList(){
        List<User> users = userMapper.selectList(null);
        for (User user: users) {
            System.out.println(user);
        }
    }
}
