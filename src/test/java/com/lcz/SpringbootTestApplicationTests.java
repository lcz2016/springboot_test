package com.lcz;

import com.lcz.models.User;
import com.lcz.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootTestApplicationTests {
    @Autowired
     Person p;
    @Autowired
     Dog d;
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println(p.getAge());
        System.out.println(d.getPerson().getName());
        List<User> userList = userMapper.selectList(null);

        userList.forEach(System.out::println);
        User user = new User();
        user.setName("lcz");
        user.setAge(30);
        user.setEmail("344544399@qq.com");
        userMapper.insert(user);

    }

}
