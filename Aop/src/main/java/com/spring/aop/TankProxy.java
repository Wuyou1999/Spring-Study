package com.spring.aop;

public class TankProxy implements Move{
    private Move t;

    public TankProxy(Move t) {
        this.t = t;
    }
    @Override
    public void move() {
        System.out.println("Start!");
        t.move();
        System.out.println("finsh!");
    }
}
