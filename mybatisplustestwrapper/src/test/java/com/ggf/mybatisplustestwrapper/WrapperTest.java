package com.ggf.mybatisplustestwrapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ggf.mybatisplustestwrapper.entity.User;
import com.ggf.mybatisplustestwrapper.mapper.RoleMapper;
import com.ggf.mybatisplustestwrapper.mapper.UserMapper;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @Descripton 测试类
 * @Author: gqf
 * @create: 2019-06-06 10:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WrapperTest {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;

    @Test
    public void wrapperTest(){
        System.out.println("—————————————普通查询——————————————————");
        List<User> resourceList = userMapper.selectList(new QueryWrapper<User>().eq("role_id", 2L));
        List<User> lamdaList = userMapper.selectList(new QueryWrapper<User>().lambda().eq(User::getRoleId, 2l));
        Assert.assertEquals(resourceList.size(), lamdaList.size());
        print(lamdaList);

        System.out.println("———————————--带子查询的sql——————————————————");
        List<User> roleUser1 = userMapper.selectList(new QueryWrapper<User>().inSql("role_id", "SELECT id from user where id = 2"));
        List<User> roleUser2 = userMapper.selectList(new QueryWrapper<User>().lambda().inSql(User::getRoleId, "SELECT id from user where id = 2"));
        Assert.assertEquals(roleUser1.size(),roleUser2.size());
        print(roleUser2);

        System.out.println("———————————---带嵌套的查询——————————————————");
//        userMapper.selectList(new QueryWrapper<User>().nested())
    }

    private <T> void print(List<T> lists){
        if(!CollectionUtils.isEmpty(lists)){
            lists.forEach(System.out :: println);
        }
    }

}
