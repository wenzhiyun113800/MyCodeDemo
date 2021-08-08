package com.wzy.springbootmybatis.service;



import com.wzy.springbootmybatis.POJO.User;

import java.util.List;

public interface UserService {

  boolean addUser(User user);

  boolean updateUser(User user);

  boolean delectUser(int id);

  List<User> findAll();

  User findUserByid(int id);
}
