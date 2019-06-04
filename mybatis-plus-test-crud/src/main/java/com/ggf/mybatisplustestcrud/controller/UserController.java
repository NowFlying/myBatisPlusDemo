package com.ggf.mybatisplustestcrud.controller;


import com.ggf.mybatisplustestcrud.entity.User;
import com.ggf.mybatisplustestcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ggf
 * @since 2019-06-01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insertOne")
    public String insertUser(@RequestBody User user){
        int res = userService.insert(user);
        System.out.println(res);
        return "success";
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") int id){
       return  userService.deleteById(id);
    }

    @DeleteMapping("/deleteBatchIds")
    public int deleteBatchIds(@RequestBody List<Integer> ids){
        return userService.deleteBatchIds(ids);
    }

    @DeleteMapping("/deleteByMap")
    public int deleteByMap(@RequestBody Map<String,Object> map){
         return userService.deleteByMap(map);
    }

    @DeleteMapping("/delete")
    public int delete(){
        return userService.delete();
    }


    @PutMapping("/updateById")
    public int updateById(@RequestBody User user){
        return userService.updateById(user);
    }

    @PutMapping("/update")
    public int update(){
        return userService.update();
    }

    @GetMapping("/selectById/{id}")
    public User selectById(@PathVariable("id") Integer id){
        return userService.selectById(id);
    }

    @PostMapping("/selectBatchIds")
    public List<User> selectBatchIds(@RequestBody List<Integer> idList){
        return userService.selectBatchIds(idList);
    }
}
