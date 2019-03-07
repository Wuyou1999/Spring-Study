package com.spring.annonation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    @Value("Tom")
    private  String name;

    @Value("20")
    private double age;

    // 引用类型，通过@Autowired注入Phone的bean
    @Autowired
    private Phone phone;


}
