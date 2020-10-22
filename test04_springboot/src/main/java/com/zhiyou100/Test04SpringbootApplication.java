package com.zhiyou100;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zhiyou100.*")
@MapperScan("com.zhiyou100.dao")
public class Test04SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test04SpringbootApplication.class, args);
	}
}
