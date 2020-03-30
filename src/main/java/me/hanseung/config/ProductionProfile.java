package me.hanseung.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class ProductionProfile {

    @Bean(name = "hello1")
    public String hello1() {
        return "hello production 1";
    }

    @Bean(name = "hellofirst")
    public String hello() {
        return "hello production";
    }
}
