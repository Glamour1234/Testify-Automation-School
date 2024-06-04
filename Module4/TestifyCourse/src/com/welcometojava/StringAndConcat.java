package com.welcometojava;

public class StringAndConcat{
    public static void main(String[] args)
    {
        String bird = "hummingBird";
        String adjective = "isBeautiful";
        //Sting newString = bird + adjective;
        //System.out.println(newString);

        System.out.println(bird + adjective);

        String movieName = "matrix: ";
       int parts = 2;
       boolean isReleased = false;
        System.out.println(movieName.concat(parts+ ""));
    }
}
