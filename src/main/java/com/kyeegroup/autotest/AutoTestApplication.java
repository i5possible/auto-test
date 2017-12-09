package com.kyeegroup.autotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AutoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoTestApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello word，演示一下配置文件的端口和上下文根";
	}
}
