package com.jixuan.user_centerbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.jixuan.user_centerbackend.mapper")
@EnableScheduling
public class UserCenterBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterBackendApplication.class, args);
    }

}
