package com.kunalKushwahaJavaBootcamp.firstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long principal = sc.nextLong();
        float time = sc.nextFloat();
        float rate = sc.nextFloat();
        float interest = principal * rate * time / 100;
        System.out.println("Interest is: " + interest);
    }
}
