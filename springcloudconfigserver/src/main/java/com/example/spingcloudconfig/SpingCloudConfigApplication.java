package com.example.spingcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class SpingCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingCloudConfigApplication.class, args);
	}

}
