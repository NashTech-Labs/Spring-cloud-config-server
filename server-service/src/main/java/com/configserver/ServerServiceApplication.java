package com.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring cloud server which is connected to the git cloud config server.
 */
@SpringBootApplication
@EnableConfigServer
public class ServerServiceApplication {
	/**
	 * The entry point of application.
	 *
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServerServiceApplication.class, args);
	}

}
