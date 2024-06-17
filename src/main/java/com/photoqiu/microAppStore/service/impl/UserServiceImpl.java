package com.photoqiu.microAppStore.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.photoqiu.microAppStore.entity.User;
import com.photoqiu.microAppStore.mapper.UserMapper;
import com.photoqiu.microAppStore.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserService {
}