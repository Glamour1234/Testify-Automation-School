package com.codingChallenge;

//check for prime numbers
public class Task4 {
    public static void main(String[] args) {

        //int num = 0;
        for (int i = 2; i <= 100; i++) {
            if (primeNumbers(i)) {
                System.out.print(i + " ");

            }
        }

    }

    //method to check if a function is prime
    public static boolean primeNumbers(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
















