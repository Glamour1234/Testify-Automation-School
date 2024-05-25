package com.welcometojava;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome! Please input your age");

        try {
            int age = userInput.nextInt();
            System.out.println("You are  " + age + "years old" );

        }catch(Exception nameException) {
            System.out.println("You can't enter your name, the required input is your age");

        }
    }
}
