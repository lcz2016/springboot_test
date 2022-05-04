package com.lcz;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 標注是一個springboot應用是義哥
public class SpringbootTestApplication {

    public static void main(String[] args) {
        /*关闭banner*/
        /*SpringApplication springApplication = new SpringApplication(SpringbootTestApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);*/
        SpringApplication.run(SpringbootTestApplication.class, args);
    }


}
