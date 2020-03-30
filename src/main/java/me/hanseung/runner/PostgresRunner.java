package me.hanseung.runner;

import me.hanseung.model.Account;
import me.hanseung.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

//@Component
public class PostgresRunner implements ApplicationRunner {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String username = "hanseung1";
        accountRepository.save(new Account(username, "123456"));
        Account a = accountRepository.findByUsername(username);

        System.out.println("account : " + a);
    }
}
