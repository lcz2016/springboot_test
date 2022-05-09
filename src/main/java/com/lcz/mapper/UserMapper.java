package com.lcz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lcz.models.User;
import com.lcz.models.UserDto;
import com.lcz.models.UserVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> findPageUsers(Page<User> page);
    List<User> findPageUsersbySQl(Page<User> page,String sql);
    List<UserVo> getUserName(Page page, UserDto userDto);
}


