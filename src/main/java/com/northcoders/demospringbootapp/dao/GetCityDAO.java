package com.northcoders.demospringbootapp.dao;

import com.northcoders.demospringbootapp.model.City;
import com.northcoders.demospringbootapp.model.Results;
import org.springframework.web.reactive.function.client.WebClient;

public class GetCityDAO {

    public static City getCity(){
        WebClient webClient = WebClient.builder()
                .baseUrl("https://geocoding-api.open-meteo.com/v1/search?name=London&count=1&language=en&format=json")
                .build();

        Results responseBody = webClient
                .get()
                .retrieve()
                .bodyToMono(Results.class)
                .block();

        return responseBody.results().getFirst();
    }

}
