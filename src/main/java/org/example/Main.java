package org.example;

public class Main {
    public static void main(String[] args){
        Complex num1 = new Complex(2, 2);
        Complex num2 = new Complex(3, 3);

        System.out.println(num1.add(num1, num2));
        System.out.println(num1.sub(num1, num2));
        System.out.println(num1.mul(num1, num2));
        System.out.println(num1.div(num1, num2));
    }
}