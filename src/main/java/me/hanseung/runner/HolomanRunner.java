package me.hanseung.runner;

import me.hanseung.Holoman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class HolomanRunner implements ApplicationRunner { // <= 스프링 부트가 실행될 때 인자를 받아 생성되는 Bean을 만들기 위해 사용

    @Autowired
    Holoman holoman;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(holoman);
    }
}
