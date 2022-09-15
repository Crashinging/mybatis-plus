package com.chenjy.mp_demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chenjy.mp_demo1.mapper")
public class MpDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(MpDemo1Application.class, args);
    }

}
