package com.lcz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Person {
    @Value("李朝州")
    private String name;
    @Value("30")
    private Integer age;
    private List<String> lists;

    public Person(){}
    public Person(String name, Integer age, List<String> lists) {
        this.name = name;
        this.age = age;
        this.lists = lists;
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

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }
}
