package com.debuggeando_ideas;

public class LambdaApp {
    public static void main(String[] args) {
        Math substract = (a , b) -> a-b;

        Math multiply = (a , b) -> a * b;

        Math divide = (a , b) -> {
            System.out.println("Start");
            return a/b;
        };

        System.out.println(substract.execute(4.6,5.0));
        System.out.println(multiply.execute(50.0, 5.0));
        System.out.println(divide.execute(10.0,2.0));

        System.out.println(divide.sum(5.0,6.0));
    }
}
