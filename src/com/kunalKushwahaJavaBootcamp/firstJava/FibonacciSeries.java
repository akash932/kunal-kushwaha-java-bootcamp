package com.kunalKushwahaJavaBootcamp.firstJava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + ", " + n2);
        int count = 1;
        while(count <= n-2){
            int sum = n1 + n2;
            System.out.print(", " + sum);
            n1 = n2;
            n2 = sum;
            count++;
        }
    }
}
