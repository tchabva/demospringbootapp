package com.northcoders.demospringbootapp.dao;

import com.northcoders.demospringbootapp.model.City;
import org.springframework.web.reactive.function.client.WebClient;

public class GetCityDAO {

    public static City getCity(){
        WebClient webClient = WebClient.builder()
                .baseUrl("https://geocoding-api.open-meteo.com/v1/search?name=London&count=1&language=en&format=json")
                .build();

        City responseBody = webClient
                .get()
                .retrieve()
                .bodyToMono(City.class)
                .block();

        return responseBody;
    }

}
