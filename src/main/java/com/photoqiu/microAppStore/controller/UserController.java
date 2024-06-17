package com.photoqiu.microAppStore.controller;


import com.photoqiu.microAppStore.entity.User;
import com.photoqiu.microAppStore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.list();
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.save(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        userService.updateById(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.removeById(id);
    }
}
