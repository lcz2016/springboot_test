package com.lcz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;


@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Component
@ConfigurationProperties(prefix ="dog")
public class Dog {
//    public Dog(){}
//    public Dog(String name, Integer age, List<String> lists) {
//        this.name = name;
//        this.age = age;
//        this.lists = lists;
//    }

    private String name;
    private Integer age;
    private List<String> lists;
    private Person person;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public List<String> getLists() {
//        return lists;
//    }
//
//    public void setLists(List<String> lists) {
//        this.lists = lists;
//    }
}
