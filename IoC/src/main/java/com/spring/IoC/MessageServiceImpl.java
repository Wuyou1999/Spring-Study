package com.spring.IoC;

public class MessageServiceImpl implements MessageService{
    private String username;
    private int age;
    public MessageServiceImpl(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getMessage() {
        return "Hello World！{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }




}
