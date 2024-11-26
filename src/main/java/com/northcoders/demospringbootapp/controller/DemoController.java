package com.northcoders.demospringbootapp.controller;

import com.northcoders.demospringbootapp.dao.GetCityDAO;
import com.northcoders.demospringbootapp.dao.GetSunriseSunsetDAO;
import com.northcoders.demospringbootapp.model.City;
import com.northcoders.demospringbootapp.model.Person;
import com.northcoders.demospringbootapp.model.SunriseSunset;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class DemoController {

    City city = GetCityDAO.getCity("London");

    @GetMapping("/hello")
    public String getHello(){
        return "Hello there!";
    }


    List<Person> people = List.of(
            new Person("Tawanda", 29 ,"Tawanda@testing.com", "Zimbabwe", "Churros"),
            new Person("Peter", 24, "Peter@testing.com", "England", "Churro-Flavoured Cereal")
    );

    @GetMapping("/people")
    public List<Person> getPeople(){
        return people;
    }

    @GetMapping("/city")
    public City getCity(){

        return city;
    }

    @GetMapping("/sun")
    public SunriseSunset getSunriseSunset(){

        return GetSunriseSunsetDAO.getSun(city.latitude(),city.longitude());

    }
}
