package com.codingChallenge;

import java.util.Scanner;
//palindrome
public class Task1 {
    public static void main(String[] args) {
        String original = "";
        String reverse = "";

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string or number to check if it is a palindrome");

        original = userInput.nextLine();

        int length = original.length();
        for(int i = length-1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
            if(original == reverse) {
                System.out.println("String/number is a palindrome");
            }else {
                System.out.println("String/number is not a palindrome");
            }




    }
}

//class palindrome {
//    public static boolean isPalindrome(String str) {
//        StringBuilder reversed = new StringBuilder(str).reverse();
//        return str.equals(reversed.toString());
//    }
//
//    public static void main(String[] args) {
//        String value = "racecar";
//        if (isPalindrome(value)) {
//            System.out.println(value + " is a palindrome string.");
//        } else {
//            System.out.println(value + " is not a palindrome string.");
//        }
//    }
//}