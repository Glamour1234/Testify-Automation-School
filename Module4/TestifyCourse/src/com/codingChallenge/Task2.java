package com.codingChallenge;

//reverse words in a sentence using recursion
public class Task2 {
    public static String reverseWords(String str){

        if(str.isEmpty()) {
            //System.out.println("String is empty.");
            return str;
        }

        else
        {
            return reverseWords(str.substring(1))+str.charAt(0);
        }
    }

    public static void main(String[] args) {

        String myWord = " I am the best Automation Tester";
        System.out.println(reverseWords(myWord));
    }

}








