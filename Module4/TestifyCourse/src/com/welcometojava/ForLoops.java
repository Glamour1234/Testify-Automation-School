package com.welcometojava;

public class ForLoops {
    public static void main(String[] args) {
        //incrementing
        for (int i = 0; i < 10; i++) {
            System.out.println("student: " + i);
        }

        //decrementing
        for (int i = 10; i > 0; i--) {
            System.out.println("student: " + i);

            String[] fruits = {"mango", "orange", "banana"};
            for (String vName : fruits) {
                System.out.println(vName);
            }
        }

    }

}
