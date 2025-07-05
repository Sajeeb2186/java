package com.ok.javalearning.opps.encapsulation;

public class Main {
    public static void main(String[] args) {


        car car= new car();

        car.setSpeed(111);
        car.setColor("yellow");

        System.out.println(car.getSpeed());
        System.out.println(car.getColor());

    }
}
