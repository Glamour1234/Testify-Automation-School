package com.welcometojava;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args)
    {
        //scanner Class allows obtain input of primitive types like int, double and strings
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome! Please input your DOB");

        //next is a function used to read values whether numerical or strings
        short dob = userInput.nextShort();
        short presentYear = 2024;
        int customersAge = presentYear - dob
        System.out.println("You are  " + customersAge + "years old" );

        if(customersAge < 18){
            System.out.println("Too young to bet. Bye");
        }else (customersAge >= 18){
        System.out.println("You are qualified");

    }

    }
}
