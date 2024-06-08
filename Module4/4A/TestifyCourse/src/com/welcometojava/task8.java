package com.welcometojava;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args)
    {
        //simple interest calculation
        Scanner userInput = new Scanner(System.in);
        System.out.println("Kindly input the needed information to calculate yout interest");

        short principal = userInput.nextShort();
        short rate = userInput.nextShort();
        short time = userInput.nextShort();
        int interest = (principal * rate * time)/100;

        System.out.println("Your interest is "+ " " + interest);
    }
}









