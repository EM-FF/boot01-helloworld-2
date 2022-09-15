package com.study.boot.controller;

import com.study.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HH
 * @version 1.0
 */
@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/person")
    public Person person(){
        System.out.println("person:");
        System.out.println("hot-fix");
        System.out.println("master test");
        return person;
    }

}
