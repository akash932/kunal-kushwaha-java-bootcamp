package com.kunalKushwahaJavaBootcamp.firstJava;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!!");
    }
}
