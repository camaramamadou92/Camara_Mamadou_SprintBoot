package com.example.mydashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer
@EnableHystrix
@EnableHystrixDashboard


public class MyDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDashboardApplication.class, args);
	}

}
