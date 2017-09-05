package com.example.demo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/5.
 */
public class Person implements Serializable {
    private  String id;
    private String name;
    private Integer age;

    public  Person(){
        super();
    }
    public Person(String id, Integer age, String name) {
        super();
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
