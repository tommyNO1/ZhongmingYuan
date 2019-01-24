package com.sheldon.real.time.communication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.sheldon.real.time.communicate.mapper")
public class RealTimeCommunicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealTimeCommunicationApplication.class, args);
    }

}

