package com.ok.javalearning.opps;

public class Main {
    public static void main(String[] args) {


        car car= new car();
        car.speed=150;
        car.color="RED";
        System.out.println(car.color);
        System.out.println(car.speed);
        car.drive();

    }
}
