package com.northcoders.demospringbootapp;

import com.northcoders.demospringbootapp.dao.GetSunriseSunsetDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemospringbootappApplication {

	public static String city;

	public static void main(String[] args) {

		SpringApplication.run(DemospringbootappApplication.class, args);

	}

}
