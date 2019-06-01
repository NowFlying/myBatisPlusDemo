package com.ggf.mybatisplustestgenerator.user.service.impl;

import com.ggf.mybatisplustestgenerator.user.entity.User;
import com.ggf.mybatisplustestgenerator.user.mapper.UserMapper;
import com.ggf.mybatisplustestgenerator.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ggf
 * @since 2019-06-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
