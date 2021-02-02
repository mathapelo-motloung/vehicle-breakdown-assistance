package com.zensar.vehiclebreakdown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.zensar.vehiclebreakdown.dao.UserDao;

@ComponentScan
@SpringBootApplication
public class VehiclebreakdownApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiclebreakdownApplication.class, args);
	}

}
