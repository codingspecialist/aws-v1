package com.metacoding.v1.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {
    
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void hello_테스트(){
        ResponseEntity<String> response = restTemplate.getForEntity("/aws/v1", String.class);       
        assertEquals("<h1>aws v1</h1>", response.getBody());
    }
}
