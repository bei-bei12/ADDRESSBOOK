package com.dice.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //自动帮你写好构造函数等
@NoArgsConstructor
@AllArgsConstructor
public class User {
    //若希望id自增，则加以下注解
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    // 头像存储的是图片url
    private String photo;
}
