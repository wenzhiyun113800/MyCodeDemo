package com.wzy.Controller;


import com.wzy.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class Usercontroller {
  @Autowired
  private RedisTemplate redisTemplate;
@PostMapping("/set")
  public void  set(@RequestBody User user) {
  redisTemplate.opsForValue().set("user", user);
}
@GetMapping("/get/{key}")
   public User get(@PathVariable("key") String key){
     return  (User)redisTemplate.opsForValue().get(key);
  }
@DeleteMapping("/delect/{key}")
  public Boolean delect(@PathVariable("key") String key){
    redisTemplate.delete(key);
    return  redisTemplate.hasKey(key);
}
@GetMapping("String")
  public String StringTest(){
  redisTemplate.opsForValue().set("str","helloworld");
  String str=(String)redisTemplate.opsForValue().get("str");
  return  str;
}
@GetMapping("/list")
  public List<String> list(){
  ListOperations<String,String> oplist=redisTemplate.opsForList();
  oplist.leftPush("list","hello");
  oplist.leftPush("list","world");
  oplist.leftPush("list","wenzhiyun");
  List<String> list=oplist.range("list",0,3);
  return  list;
}
@GetMapping("/set")
  public Set<String> set(){
 SetOperations setOperations= redisTemplate.opsForSet();
 setOperations.add("set","hello");
setOperations.add("set","hello");
setOperations.add("set","world");
  setOperations.add("set","world");
  setOperations.add("set","wenzhiyun");
  Set<String> set=setOperations.members("set");
  return  set;



}

  @GetMapping("/zset")
  public Set<String> zset(){
    ZSetOperations zsetOperations= redisTemplate.opsForZSet();
    zsetOperations.add("zset","hello",1);
    zsetOperations.add("zset","hello",2);
    zsetOperations.add("zset","world",3);
    zsetOperations.add("zset","world",4);
    zsetOperations.add("zset","wenzhiyun",5);
    Set<String> set=zsetOperations.range("zset",0,3);
    return  set;

  }
  @GetMapping("/hash")
  public  void hash(){
    HashOperations hashOperations=redisTemplate.opsForHash();
    hashOperations.put("key","hskey","wenzhiyun");
    System.out.println(hashOperations.get("key","hskey"));
  }
}
