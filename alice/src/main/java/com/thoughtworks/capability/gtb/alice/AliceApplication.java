package com.thoughtworks.capability.gtb.alice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AliceApplication {

  public static void main(String[] args) {
    SpringApplication.run(AliceApplication.class, args);
  }

  @GetMapping("/hello")
  public String helloFromBob(){
    String url = "http://bob:8081/hello";
    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(url, String.class);
    return result;
  }
}
