package com.example.mycollegefinalmisson;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mycollegefinalmisson.demos.web.Mapper")
public class MyCollegeFinalMissonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCollegeFinalMissonApplication.class, args);
    }

}
