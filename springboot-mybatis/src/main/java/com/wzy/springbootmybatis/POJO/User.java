package com.wzy.springbootmybatis.POJO;

import lombok.Data;

@Data
public class User {
  private  int id;
  private  String name;
  private  int age;

  public User() {
  }


  public User(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
