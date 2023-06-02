package org.example;

public class Complex {
    int a;
    int b;

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Complex add(Complex num1, Complex num2) {
        return new Complex(num1.a + num2.a, num1.b + num2.b);
    }

    public Complex sub(Complex num1, Complex num2) {
        return new Complex(num1.a - num2.a, num1.b - num2.b);
    }

    public Complex mul(Complex num1, Complex num2) {
        int a = num1.a;
        int b = num1.b;
        int c = num2.a;
        int d = num2.b;
        return new Complex(a * c - b * d, b * c + a * d);
    }

    public Complex div(Complex num1, Complex num2) {
        int a = num1.a;
        int b = num1.b;
        int c = num2.a;
        int d = num2.b;
        return new Complex((a * c + b * d) / (c * c + d * d), (b * c - a * d) / (c * c + d * d));
    }
}
