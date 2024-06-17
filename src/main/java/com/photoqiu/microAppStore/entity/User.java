package com.photoqiu.microAppStore.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String email;
    private String telephone;
}
