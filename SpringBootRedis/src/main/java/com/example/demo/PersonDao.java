package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/5.
 */
@Repository
public class PersonDao {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    ValueOperations<String,String> valueOpsStr;

    @Autowired
    RedisTemplate<Object,Object> redisTemplate;
    @Resource(name = "redisTemplate")
    ValueOperations<Object,Object> valueOps;
    //存储字符串类型
    public void stringRedisTempleteDemo(){
        valueOpsStr.set("xx","yy");
    }
    //存储对象类型
    public  void  save(Person person){
        valueOps.set(person.getId(),person);
    }
    //获得字符串
    public  String getString(){
        return  valueOpsStr.get("xx");
    }
    //获取对象类型
    public Person getPerson(){
        return (Person) valueOps.get("1");
    }
}
