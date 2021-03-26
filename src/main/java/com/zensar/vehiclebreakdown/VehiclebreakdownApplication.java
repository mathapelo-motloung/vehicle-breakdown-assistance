/**
 * Authors: Mathapelo Motloung
 * 			Kwanele Bam
 * 			Alfred Motaung
 * 			Success Nkonwana
 * 			Thabo Mkhari
 * 
 * Project: Vehicle Breakdown Assistance
 */
package com.zensar.vehiclebreakdown;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.zensar.vehiclebreakdown.dao.UserDao;

@ComponentScan
@SpringBootApplication
public class VehiclebreakdownApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(VehiclebreakdownApplication.class, args);
	}
	
	 @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(VehiclebreakdownApplication.class);
	  }

}
