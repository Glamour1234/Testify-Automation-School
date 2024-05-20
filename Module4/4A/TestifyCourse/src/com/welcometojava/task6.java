package com.welcometojava;

public class task6 {
    public static void main(String[] args)
    {
        //reversing a string
        String originalString = "DEMOCRACY";
        String reversedString = "";

        for (int i = 0; i < originalString.length(); i++) {
            reversedString = originalString.charAt(i) + reversedString;
        }
        System.out.println(reversedString);
    }
}

