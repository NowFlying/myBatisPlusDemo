package com.ggf.mybatisplustestpagination.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Descripton MybatisPlus配置类
 * @Author: gqf
 * @create: 2019-06-06 19:18
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.ggf.mybatisplustestpagination.service.*.mapper*")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
