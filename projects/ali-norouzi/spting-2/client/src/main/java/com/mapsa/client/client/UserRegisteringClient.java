package com.mapsa.client.client;

import com.mapsa.client.data.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class UserRegisteringClient {

    @Value("${uri.register}")
    private String uri;
    private RestTemplate restTemplate;

    public List<User> users(){
        restTemplate = new RestTemplate();
        ResponseEntity<List<User>> responseEntity = restTemplate.exchange(uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<User>>() {
                });
        List<User> users = responseEntity.getBody();
        return users;
    }

    public ResponseEntity<User> save(User user) throws URISyntaxException {
        restTemplate = new RestTemplate();
        URI uri1 = new URI(uri);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<User> request = new HttpEntity<>(user,httpHeaders);
        ResponseEntity<User> result = restTemplate.postForEntity(uri1,request,User.class);
        return result;
    }
}
