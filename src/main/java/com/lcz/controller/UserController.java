package com.lcz.controller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lcz.mapper.UserMapper;
import com.lcz.models.User;
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


}
