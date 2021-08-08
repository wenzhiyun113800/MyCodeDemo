package com.wzy.springbootmybatis.Controller;


import com.wzy.springbootmybatis.POJO.User;
import com.wzy.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
  @Autowired
  UserService userService;

  @RequestMapping("/helloworld")
  @ResponseBody
  public String helloworld(){
    System.out.println("---------开始----------");
    return  "helloworld";
  }


  @RequestMapping("/addUser")
  public void addUser(@RequestBody User user){
    System.out.println(user);

    userService.addUser(user);

  }

  @RequestMapping("/Update")
  public Boolean getUser(@RequestBody User user) {
   return  userService.updateUser(user);

  }
  @RequestMapping("/delect/{id}")
  public void delectUser(@PathVariable int id) {
    userService.delectUser(id);

  }
  @RequestMapping("/findUserById/{id}")
  public User findUserById(@PathVariable int id) {
    return userService.findUserByid(id);

  }

  @RequestMapping("/findUserAll")
  public List<User> delectUsefindUserAll() {
    return userService.findAll();

  }

}




