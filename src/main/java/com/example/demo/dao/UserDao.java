package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    //增加
    @Insert("INSERT INTO test (creatdate,personnel,remarks,department) VALUES(#{creatdate},#{personnel},#{remarks},#{department})")
     void add(User user);

    //删除
    @Delete("DELETE FROM test WHERE id=#{id}")
     void delete(Integer id);

    //修改
    @Update("UPDATE test SET creatdate=#{creatdate},personnel=#{personnel},remarks=#{remarks},department=#{department} WHERE id=#{id}")
    void update(User user);

    //查询
    @Select("SELECT * FROM test")
    List<User> select();

    //查询单个
    @Select("SELECT * FROM test where id=#{id}")
    User selectOne(Integer id);

}
