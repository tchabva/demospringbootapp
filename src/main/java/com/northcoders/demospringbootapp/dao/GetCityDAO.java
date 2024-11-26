package com.northcoders.demospringbootapp.dao;

import com.northcoders.demospringbootapp.DemospringbootappApplication;
import com.northcoders.demospringbootapp.model.City;
import com.northcoders.demospringbootapp.model.CityResults;
import org.springframework.web.reactive.function.client.WebClient;

public class GetCityDAO {

    public static City getCity(String city){
        WebClient webClient = WebClient.builder()
                .baseUrl("https://geocoding-api.open-meteo.com/v1/search")
                .build();

        try{
            CityResults responseBody = webClient
                    .get()
                    .uri("?name="+ city +"&count=1&language=en&format=json")
                    .retrieve()
                    .bodyToMono(CityResults.class)
                    .block();

            return responseBody.results().getFirst();
        } catch(Exception e){
            System.out.println("City not found!");
            return null;
        }

    }

}
