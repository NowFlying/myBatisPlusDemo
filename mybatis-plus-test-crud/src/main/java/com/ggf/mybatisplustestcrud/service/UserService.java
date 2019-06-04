package com.ggf.mybatisplustestcrud.service;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.UpdateChainWrapper;
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
    public Integer deleteByMap(Map<String,Object> map){
         int delete = userMapper.deleteByMap(map);
         return delete;
    }

    /**
     *  通过条件删除
     * @Date 2019-06-03 17:26
     * @param
     * @return
     **/
    public Integer deletes(){
//        EntityWrapper<User> ew = new EntityWrapper<User>();
//        userMapper.delete();
        return null;
    }

    /**
     *  根据id进行更新
     * @Date 2019-06-04 11:41
     * @param
     * @return
     **/
    public Integer updateById(User user){
        int res = userMapper.updateById(user);
        return res;
    }

    /**
     *  通过构造器构造条件
     * @Date 2019-06-04 14:50
     * @param
     * @return
     **/
    public Integer update(){
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("age","23");
        User user = new User();
        user.setName("lisi");
        int res = userMapper.update(user,updateWrapper);
        return res;
    }

    /**
     * 通过id查找
     * @Date 2019-06-04 20:56
     * @param
     * @return
     **/
    public User selectById(Integer id){
        User user = userMapper.selectById(id);
        return user;
    }

    /**
     *  根据id集合查找
     * @Date 2019-06-04 21:02
     * @param
     * @return
     **/
    public List<User> selectBatchIds(List<Integer> idList){
        List<User> users = userMapper.selectBatchIds(idList);
        return users;
    }
}
