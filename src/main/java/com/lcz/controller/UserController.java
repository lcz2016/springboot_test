package com.lcz.controller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lcz.mapper.UserMapper;
import com.lcz.models.User;
import com.lcz.models.UserDto;
import com.lcz.models.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/getUser")
    public User get_user(){
        User user = userMapper.selectById(1);
        return user;
    }

    @GetMapping("/datalist")
    public List<User> data_list(){
        List<User> users = userMapper.selectList(null);
        return users;
    }

    @GetMapping("/updateUser")
    public User update_user(){
        User user = userMapper.selectById(1);
        System.out.println(user);
        user.setName("张三12222");
        Integer i12 = userMapper.updateById(user);
        return user;
    }

    @GetMapping("/pageUser")
    public List<UserVo> page_user(){
        UserDto userDto = new UserDto();
        userDto.setName("lcz");
        List<UserVo> userNames = userMapper.getUserName(new Page(1,4),userDto);
        System.out.println(userNames);
        return userNames;
    }
}
