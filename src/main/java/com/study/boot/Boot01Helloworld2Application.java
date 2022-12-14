package com.study.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Boot01Helloworld2Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot01Helloworld2Application.class, args);
    }

}
