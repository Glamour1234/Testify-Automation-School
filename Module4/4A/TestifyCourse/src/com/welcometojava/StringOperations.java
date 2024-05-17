package com.welcometojava;

public class StringOperations {
    public static void main(String[] args)
    {
        String word = orGANization;
         //upper and lowercase methods

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        //0  1  2  3  4  5
        //l  e  n  g  t  h
        //-6 -5 -4 -3 -2 -1
        System.out.println(word.length());

        //index of a character
        System.out.println(word.indexOf("G"));

        //char at a particular index
        System.out.println(word.charAt(6));

        //to slice out a word from organization
        System.out.println(word.substring(0,5));

        //char at a particular index
        System.out.println(word.charAt(word.length()-1));

    }
}
