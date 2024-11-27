package com.northcoders.demospringbootapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SunriseSunset (String sunrise, String sunset){

    @Override
    public String toString() {
        return "Sunsrise: " + sunrise + " Sunset: " + sunset;
    }
}
