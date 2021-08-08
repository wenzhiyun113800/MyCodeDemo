package com.wzy.springboot001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {
  @GetMapping("/hello")
  @ResponseBody
  public String hello() {
    return "hello spring boot001";
  }
}
