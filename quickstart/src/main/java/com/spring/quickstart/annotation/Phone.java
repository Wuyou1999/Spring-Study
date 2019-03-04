package com.spring.quickstart.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//采用注解和Lombok开发的Phone类
@Component
@Data
public class Phone {
    @Value("荣耀v20")
    private  String brand;

    @Value("2999.0")
    private double price;


}
