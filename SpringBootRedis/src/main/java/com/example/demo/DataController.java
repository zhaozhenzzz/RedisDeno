package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/5.
 */
@RestController
public class DataController {

    @Autowired
    PersonDao personDao;

    @RequestMapping("/test")
    public void set(){
        Person p = new Person("1",23,"zhaozhen");
        personDao.save(p);
        personDao.stringRedisTempleteDemo();
    }

    @RequestMapping("/getStr")
    public String getStr(){
        return personDao.getString();

    }
    @RequestMapping("/getPerson")
    public Person getPerson(){
        return  personDao.getPerson();
    }

}
