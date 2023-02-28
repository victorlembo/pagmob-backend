package com.example.cittamobi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ServiceController {

    private static final String URL = "https://api.cittamobi.com.br/m3p/js/prediction/stop/5208036,5195544";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/services")
    public List<Service> getServices() {
        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Map<String, Object>>() {});

        List<Service> services = new ArrayList<>();

        if (response.getBody() != null && response.getBody().containsKey("services")) {
            ObjectMapper mapper = new ObjectMapper();
            services = mapper.convertValue(response.getBody().get("services"), new TypeReference<List<Service>>(){});
        }

        return services;
    }
    
    @GetMapping("/services/{routeCode}")
    public List<Service> getServices(@PathVariable String routeCode) {
        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(
                URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Map<String, Object>>() {});

        List<Service> services = new ArrayList<>();

        if (response.getBody() != null && response.getBody().containsKey("services")) {
            ObjectMapper mapper = new ObjectMapper();
            services = mapper.convertValue(response.getBody().get("services"), new TypeReference<List<Service>>(){});
        }

      
        List<Service> filteredServices = services.stream()
                .filter(service -> service.getRouteCode().equals(routeCode))
                .collect(Collectors.toList());

        return filteredServices;
    }

    
    
}
