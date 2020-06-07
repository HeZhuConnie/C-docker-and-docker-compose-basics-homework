package com.thoughtworks.capability.gtb.bob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class BobApplication {

  public static void main(String[] args) {
    SpringApplication.run(BobApplication.class, args);
  }

  @GetMapping("/hello")
  public String hello(){
    return "Hello from Bob!";
  }
}
