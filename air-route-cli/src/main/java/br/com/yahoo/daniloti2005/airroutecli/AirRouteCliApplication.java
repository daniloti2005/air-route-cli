package br.com.yahoo.daniloti2005.airroutecli;

import java.util.logging.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AirRouteCliApplication {

	public static String path;
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AirRouteCliApplication.class);
		LogManager.getLogManager().reset();
		path = args[0];
		app.run(args);
	}

}
