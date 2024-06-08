package com.codingChallenge;

//Reverse "TestifyAutomation" using recursion in Java
public class Task7 {

    public static void main(String[] args) {
        String strs = "TestifyAutomation";
        System.out.println(" The entered String is: " + strs);
        System.out.println("The reverse of the entered the String :");
        reverseString(strs);

    }

    public static String reverseString(String str) {
        //If the string is null or consists of single character
        //then print the entered string
        if ((str == null) || (str.length() <= 1))
            System.out.println(str);
        else {
            //If string consists of multiple strings
            System.out.print(str.charAt(str.length() - 1));
            //Call the function recursively to reverse the string
            reverseString(str.substring(0, str.length() - 1));
        }
        return str;
    }
}
