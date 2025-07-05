package com.ok.javalearning.opps.inheritance;

public class test {
    public static void main(String[] args) {
        teacher t1=new teacher();

        t1.name="sajeeb";
        t1.age=24;
        t1.quealificaiton="bsc in cse";

        System.out.println("name:"+t1.name);
        System.out.println(
                "age:"+t1.age
        );
        System.out.println("qualification:"+t1.quealificaiton);


        //System.out.println(Thread.currentThread().getName());
    }
}
