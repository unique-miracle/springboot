package com.model;

/**
 * @description:学生实体
 * @author:San Jinhong
 * @create:2018-08-29 15:42
 **/
import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -1045400711049154419L;

    private Integer id;

    private String name;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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