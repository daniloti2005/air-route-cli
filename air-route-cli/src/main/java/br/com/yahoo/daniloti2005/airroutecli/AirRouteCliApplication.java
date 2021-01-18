package br.com.yahoo.daniloti2005.airroutecli;

import java.util.logging.LogManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirRouteCliApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AirRouteCliApplication.class);
		LogManager.getLogManager().reset();
		app.run(args);
	}

}
