package com.wzy.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com/wzy/springbootmybatis/Dao")
public class SpringbootMybatisApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootMybatisApplication.class, args);
    System.out.println("程序正在运行...");

  }
  @Bean
  public RestTemplate restTemplate(){
    return  new RestTemplate();
  }


}
