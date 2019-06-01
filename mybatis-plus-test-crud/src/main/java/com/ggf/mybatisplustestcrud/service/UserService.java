package com.ggf.mybatisplustestcrud.service;


import com.ggf.mybatisplustestcrud.entity.User;
import com.ggf.mybatisplustestcrud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Descripton TODO
 * @Author: gqf
 * @create: 2019-06-01 18:54
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     *  插入数据
     * @Date 2019-06-01 18:55
     * @param
     * @return
     **/
    public int insert(User user){
        int res = userMapper.insert(user);
        System.out.println("插入数据成功！！！");
        return res;
    }

    /**
     *  通过id删除
     * @Date 2019-06-01 19:33
     * @param
     * @return
     **/
    public int deleteById(int id){
        int res = userMapper.deleteById(id);
        return res;
    }

    /**
     *  批量删除
     * @Date 2019-06-01 19:36
     * @param
     * @return
     **/
    public Integer deleteBatchIds(List<Integer> ids){
        int res = userMapper.deleteBatchIds(ids);
        return res;
    }

    /**
     *  根据列的名称删除
     * @Date 2019-06-01 19:39
     * @param
     * @return
     **/
    public Integer delete(Map<String,Object> map){
         int delete = userMapper.deleteByMap(map);
         return delete;
    }
}
