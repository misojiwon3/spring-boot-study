package me.hanseung.runner;

import me.hanseung.Person;
import me.hanseung.object.Phone;
import me.hanseung.object.Phone2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class PersonRunner implements ApplicationRunner {

    @Autowired
    Person person;

    @Autowired
    Phone phone;

    @Autowired
    Phone2 p2;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(person);
        System.out.println(phone.getOs());
        System.out.println(phone.getSeries());
        System.out.println(p2.getOs());
        System.out.println(p2.getSeries());
    }
}