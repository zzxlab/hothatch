package com.hiersun.output;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.hiersun.output.dao")
@SpringBootApplication
public class OutputApplication {
    public static void main(String[] args) {
        SpringApplication.run(OutputApplication.class, args);
    }

}
