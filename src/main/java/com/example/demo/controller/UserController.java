package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
    UserService userService;
    //增加
    @RequestMapping("/add")
    public void add(User user){
        user.setCreatdate(new Date());
        userService.add(user);
    }
    //删除
    @RequestMapping("/delete")
    public void delete(Integer id){
        userService.delete(id);
    }
    //修改
    @RequestMapping("/update")
    public void update(User user){
        user.setCreatdate(new Date());
        userService.update(user);
    }
    //查询
    @RequestMapping("/select")
    public List<User> select(){
        List<User> users = userService.select();
        return users;
    }
    //查询单个
    @RequestMapping("/selectOne")
    public User selectOne(Integer id){
        User user = userService.selectOne(id);
        return user;
    }
}
