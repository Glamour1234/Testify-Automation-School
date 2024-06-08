package com.welcometojava;
import java.util.Scanner;


public class task9B {
    public static void main(String[] args) {
        //while loop
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (true) {
            if (userInput != "testify") {
                System.out.println("try again");
                userInput = scanner.next();
                continue;
            } else if (userInput == "testify") {
                System.out.println("correct input");
                break;
            }


        }


    }

}
