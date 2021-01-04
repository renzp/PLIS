package com.changhe.produceline;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "")
public class NcProgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(NcProgramApplication.class, args);
    }
}
