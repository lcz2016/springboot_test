package com.lcz;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lcz.models.User;
import com.lcz.mapper.UserMapper;
import com.lcz.models.UserDto;
import com.lcz.models.UserVo;
import org.apache.ibatis.annotations.Select;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

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

        Page<User> page=new Page<>(1,2);
        List<User> pageUsers = userMapper.findPageUsers(page);
        page.setRecords(pageUsers);

        System.out.println(page.getRecords());
        System.out.println(pageUsers);

        UserDto userDto = new UserDto();
        userDto.setName("lcz");
        List<UserVo> userNames = userMapper.getUserName(new Page(1,4),userDto);
        System.out.println(userNames);
    }

}
