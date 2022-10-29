package com.pda.hello.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling// 开启任务调度
public class HelloQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloQuartzApplication.class, args);
	}

}
