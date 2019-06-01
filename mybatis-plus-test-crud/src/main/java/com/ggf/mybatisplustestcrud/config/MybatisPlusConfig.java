package com.ggf.mybatisplustestcrud.config;


import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Descripton MybatisPlus配置类
 * @Author: gqf
 * @create: 2019-06-01 18:52
 */
@Configuration
@MapperScan("com.ggf.mybatisplustestcrud.mapper")
public class MybatisPlusConfig {

}