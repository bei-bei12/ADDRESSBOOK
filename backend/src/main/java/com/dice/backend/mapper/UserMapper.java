package com.dice.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dice.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
//mybatis plus帮我们写好了sql语句，只需要继承过来即可
public interface UserMapper extends BaseMapper<User> {
}
