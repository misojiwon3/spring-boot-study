package me.hanseung.controller;

import me.hanseung.exception.SampleException;
import me.hanseung.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Autowired
    private SampleService sampleService;

    @GetMapping("/hello")
    public String hello() {
        logger.debug("hanseung log");
        System.out.println("system log");
        return "hello " + sampleService.getName() + "~~!!";
    }

    @GetMapping("/exception")
    public String exception() {
        throw new SampleException();
    }
}
