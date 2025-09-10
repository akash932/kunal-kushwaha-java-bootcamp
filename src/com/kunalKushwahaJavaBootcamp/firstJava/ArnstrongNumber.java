package com.kunalKushwahaJavaBootcamp.firstJava;

import java.util.Scanner;

public class ArnstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (isArmstrong(i))
                System.out.println(i + " ");
        }
    }

    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;

        int length = String.valueOf(number).length();

        int temp = number;
        while(temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }
        return sum == original;
    }
}
