package com.kunalKushwahaJavaBootcamp.firstJava;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        while (n > 0) {
            int rem = n % 10;
            result = result * 10 + rem;
            n /= 10;
        }

        System.out.println(result);
    }
}
