package com.kunalKushwahaJavaBootcamp.firstJava;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(isPalindromeString(name) ? name + " is a palindrome string." : name + " is not a palindrome string");
    }

    private static boolean isPalindromeString(String name) {
        int length = name.length();
        for (int i = 0; i < length; i++)
            if (name.charAt(i) != name.charAt(length-1-i))
                return false;
        return true;
    }
}
