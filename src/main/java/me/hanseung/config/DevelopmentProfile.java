package me.hanseung.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class DevelopmentProfile {

    @Bean("hello")
    public String hello() {
        return "hello development";
    }

    @Bean("hello1")
    public String hello1() {
        return "hello development 1";
    }
}
