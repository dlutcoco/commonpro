package com.netposa.mybatispro;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Slf4j
@EnableScheduling
@MapperScan(basePackages = {"mybatis.mapper"})
public class MybatisProApplication {

    public static void main(String[] args) {
        SpringApplication applicationContext = new SpringApplication(MybatisProApplication.class);
        applicationContext.run(args);
    }

}
