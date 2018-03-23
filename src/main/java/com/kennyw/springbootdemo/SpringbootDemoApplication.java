package com.kennyw.springbootdemo;

import com.kennyw.springbootdemo.util.SpringBeanUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.kennyw.springbootdemo.mapper")
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);
		SpringBeanUtil.setApplicationContext(context);
	}
}
