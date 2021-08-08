package com.wzy.springbootmybatis.service;


import com.wzy.springbootmybatis.Dao.UserDao;
import com.wzy.springbootmybatis.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{


  @Autowired
  UserDao userDao;
  @Override
  public boolean addUser(User user) {
      Boolean flag=false;
      try{
        userDao.addUser(user);
        flag=true;

      }
      catch (Exception e) {
        System.out.println("新增失败");
        e.printStackTrace();
      }
      return  flag;

  }

  @Override
  public boolean updateUser(User user) {
    Boolean flag=false;
    try{
      userDao.updateUser(user);
      flag=true;

    }
    catch (Exception e) {
      System.out.println("修改失败");
      e.printStackTrace();
    }
    return  flag;
  }

  @Override
  public boolean delectUser(int id) {
    Boolean flag=false;
    try{
      userDao.deleteUser(id);
      flag=true;

    }
    catch (Exception e) {
      System.out.println("删除失败");
      e.printStackTrace();
    }
    return  flag;
  }

  @Override
  public List<User> findAll() {
    return userDao.findAllUser();
  }



  @Override
  public User findUserByid(int id) {

    return userDao.findUserByid(id);
  }


}
