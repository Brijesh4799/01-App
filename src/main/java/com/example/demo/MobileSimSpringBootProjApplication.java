package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Phone;

@SpringBootApplication
public class MobileSimSpringBootProjApplication {

	// get IOC container
		public static void main(String[] args) {
			try (ConfigurableApplicationContext ctx = SpringApplication.run(MobileSimSpringBootProjApplication.class, args);) {
				// get target class object from the IOC container
				Phone phone=ctx.getBean("phone",Phone.class);

				// invoke the b.method

				phone.Validity("1-6-2023", "28-6-2023");
			} // try
			catch (Exception e) {
				e.printStackTrace();

				int j=10;
				int k=20;
			}
		}// main

	}// class
