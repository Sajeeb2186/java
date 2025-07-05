package com.ok.javalearning.datatypes;

public class test {

    public static void main(String[] args) {



//        String text="hello world";
//        System.out.println(text.toUpperCase());
//        System.out.println(text.length());
//        System.out.println(text.charAt(1));


//        boolean isSunny=true;
//        boolean isWarm=false;
//
//        if(isSunny && isWarm){
//            System.out.println("beach day");
//        }
//        else System.out.println("not a beach day");

        int day=2;
        String dayname;

        switch (day){
            case 1:
                dayname="saturday";
                break;
            case 2:
                dayname="sunday";
                break;
            case 3:
                dayname="Monday";
                break;
            case 4:
                dayname="Tuesday";
                break;
            case 5:
                dayname="Wednesday";
                break;
            case 6:
                dayname="Thursday";
                break;
            case 7:
                dayname="Friday";
                break;
            default:
                dayname="Unknown";


        }


        System.out.println(dayname);




    }

}
