package com.Exercise;

import java.util.Scanner;

public class strg {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the String");
        String word = s1.nextLine();
        word = word.toLowerCase();
        System.out.println("Your input is ==> " + word);
        countingChar(word);
    }

    public static void countingChar(String word) {
        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (word.charAt(i) == ch[j]) {
                    count++;
                }
            }
            System.out.println(word.charAt(i) + " " + count);
        }
    }
}
