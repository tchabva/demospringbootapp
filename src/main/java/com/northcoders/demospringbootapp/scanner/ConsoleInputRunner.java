package com.northcoders.demospringbootapp.scanner;

import com.northcoders.demospringbootapp.controller.DemoController;
import com.northcoders.demospringbootapp.dao.GetCityDAO;
import com.northcoders.demospringbootapp.dao.GetSunriseSunsetDAO;
import com.northcoders.demospringbootapp.model.City;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInputRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a City: ");
        String cityString = scanner.nextLine();

        City city = GetCityDAO.getCity(cityString);

        System.out.println(GetSunriseSunsetDAO.getSun(city.longitude(),city.latitude()));
    }
}
