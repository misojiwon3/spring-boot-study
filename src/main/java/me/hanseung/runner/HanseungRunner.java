package me.hanseung.runner;

import me.hanseung.properteis.HanseungProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HanseungRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

//    @Value("${hanseung.name}")
//    private String name;
//
//    @Value("${hanseung.age}")
//    private int age;

    @Autowired
    private HanseungProperties props;

    @Autowired
    private String hellofirst; // bean을 autowired할 때 해당 클래스의 빈이 두개 이상 등록되어 있으면 해당 빈들은 이름을 지정해야 하고, 빈을 사용할 때에는 변수명으로 식별한다.

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("============================");
        logger.debug(hellofirst);
        logger.debug("name : " + props.getName());
        logger.debug("age : " + props.getAge());
        logger.debug("============================");
    }
}
