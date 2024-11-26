package com.northcoders.demospringbootapp;

import com.northcoders.demospringbootapp.dao.GetSunriseSunsetDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemospringbootappApplication {

	public static String city;

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("enter city:");
		city = scanner.nextLine();


		SpringApplication.run(DemospringbootappApplication.class, args);


		//Terminal application:
		//	- you can enter multiple cities.
		//  - **the terminal displays the answer**


	}

}
