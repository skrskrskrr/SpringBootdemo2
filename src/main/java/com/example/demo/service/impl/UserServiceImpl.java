package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    //增加
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    //删除
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Override
    //修改
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    //查询
    public List<User> select() {
        List<User> users = userDao.select();
        return users;
    }

    @Override
    public User selectOne(Integer id) {
        User user = userDao.selectOne(id);
        return user;
    }
}
