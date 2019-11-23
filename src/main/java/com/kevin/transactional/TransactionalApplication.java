package com.kevin.transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TransactionalApplication {

    public static void main(String[] args) {
        //初始化
        SpringApplication.run(TransactionalApplication.class,args);
    }

}
