package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
    //增加
    void add(User user);
    //删除
    void delete(Integer id);
    //修改
    void update(User user);
    //查询
    List<User> select();
    //查询单个
    User selectOne(Integer id);
}
