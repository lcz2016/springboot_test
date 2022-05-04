package com.lcz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTestApplicationTests {
    @Autowired
     Person p;
    @Autowired
     Dog d;
    @Test
    void contextLoads() {
        System.out.println(p.getAge());
        System.out.println(d.getPerson().getName());
    }

}
