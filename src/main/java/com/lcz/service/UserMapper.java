package com.lcz.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lcz.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
