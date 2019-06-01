package com.ggf.mybatisplusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Descripton TODO
 * @Author: gqf
 * @create: 2019-05-31 17:44
 */

@SpringBootApplication
@MapperScan("com.ggf.mybatisplusdemo.mapper")
public class MybatisplusdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisplusdemoApplication.class, args);
	}

}
