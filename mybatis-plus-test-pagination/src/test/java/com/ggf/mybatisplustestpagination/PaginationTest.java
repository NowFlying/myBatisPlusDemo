package com.ggf.mybatisplustestpagination;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ggf.mybatisplustestpagination.Mapper.UserMapper;
import com.ggf.mybatisplustestpagination.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaginationTest {

	@Resource
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		System.out.println("测试自带的分页插件");
		Page page = new Page(1, 5);
		IPage<User> UserIPage = userMapper.selectPage(page, new QueryWrapper<User>()
				.eq("age", 20).eq("name", "jack"));
		assertThat()
	}

}
