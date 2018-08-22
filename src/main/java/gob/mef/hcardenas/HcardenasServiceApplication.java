package gob.mef.hcardenas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HcardenasServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcardenasServiceApplication.class, args);
	}
}
