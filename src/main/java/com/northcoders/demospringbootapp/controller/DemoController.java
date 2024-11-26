package com.northcoders.demospringbootapp.controller;

import com.northcoders.demospringbootapp.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class DemoController {


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
}
