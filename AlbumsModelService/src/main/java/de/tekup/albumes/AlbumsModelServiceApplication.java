package de.tekup.albumes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class AlbumsModelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumsModelServiceApplication.class, args);
	}

}
