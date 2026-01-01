package com.hexicode.moirai_ingestor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MoiraiIngestorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoiraiIngestorApplication.class, args);
	}

}
