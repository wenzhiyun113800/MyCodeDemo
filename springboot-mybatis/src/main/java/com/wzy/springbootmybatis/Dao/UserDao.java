package com.wzy.springbootmybatis.Dao;


import com.wzy.springbootmybatis.POJO.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
  @Insert("insert into user1(id,name,age)values(#{id},#{name},#{age})")
  void addUser(User user);

  @Delete("delete from user1 where id=#{id}")
  void  deleteUser(int id);

@Update("update user1 set name=#{name},age=#{age} where id=#{id}")
  void updateUser(User user);

@Select("select *from user1")
List<User> findAllUser();

@Select("select * from user1 where id=#{id} ")
User findUserByid(int id);




}
