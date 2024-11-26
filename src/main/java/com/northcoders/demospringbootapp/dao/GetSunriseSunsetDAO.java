package com.northcoders.demospringbootapp.dao;

import com.northcoders.demospringbootapp.model.SunriseResults;
import com.northcoders.demospringbootapp.model.SunriseSunset;
import org.springframework.web.reactive.function.client.WebClient;

public class GetSunriseSunsetDAO {

    public static SunriseSunset getSun(double lng, double lat){
        WebClient webClient = WebClient.builder()
                .baseUrl("https://api.sunrisesunset.io/json")
                .build();

        SunriseResults responseBody = webClient
                .get()
                .uri("?lat=" + lat + "&lng=" + lng)
                .retrieve()
                .bodyToMono(SunriseResults.class)
                .block();

        return responseBody.results();
    }
}
