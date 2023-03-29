package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j(topic = "test")
@RestController
public class Controller {
    
    
    @GetMapping("/ping/{log}")
    public String test(@PathVariable("log")  String logs)
    {
          log.info(logs);
          return logs;
    }



}