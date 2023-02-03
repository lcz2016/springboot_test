package com.lcz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

@SpringBootApplication // 標注是一個springboot應用是義哥
@EnableCaching
@EnableScheduling
@MapperScan("com.lcz.mapper")
public class SpringbootTestApplication {

    public static void main(String[] args) {
        /*关闭banner*/
        /*SpringApplication springApplication = new SpringApplication(SpringbootTestApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);*/
        SpringApplication.run(SpringbootTestApplication.class, args);
    }


}
