package com.liujie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * EnableEurekaServer启动
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer02Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer02Application.class, args);
	}

}
