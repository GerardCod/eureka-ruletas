package dev.gerardo.microservices.eureka.ruletas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRuletasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRuletasApplication.class, args);
	}

}
