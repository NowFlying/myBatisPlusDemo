package com.ggf.mybatisplustestwrapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ggf.mybatisplustestwrapper.mapper")
public class MybatisplustestwrapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisplustestwrapperApplication.class, args);
	}

}
