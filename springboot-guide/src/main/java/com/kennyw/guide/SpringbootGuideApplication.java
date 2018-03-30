package com.kennyw.guide;

import com.kennyw.guide.util.SpringBeanUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.kennyw.guide.dao")
public class SpringbootGuideApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootGuideApplication.class, args);
		SpringBeanUtil.setApplicationContext(context);
	}
}
