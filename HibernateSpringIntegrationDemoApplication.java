package com.siri.sprhibintegration.HibernateSpringIntegrationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.siri.hsi.entity.FBUser;
import com.siri.hsi.servicde.UserService;

@SpringBootApplication
@ComponentScan(basePackages = "com.siri")
@EntityScan(basePackages = "com.siri.hsi.entity")
public class HibernateSpringIntegrationDemoApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringIntegrationDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(getUserByID(1));
	}
	
	public FBUser getUserByID(Integer id) throws Exception {
		try {
			FBUser user = userService.getUserById(id);
			return user;
		} catch(Exception exe) {
			System.out.println("Exception in HibernateSpringIntegrationDemoApplication.getUserByID() at " + System.currentTimeMillis() + " EXE Message : " + exe.getMessage());
			throw exe;
		}
	}
}
