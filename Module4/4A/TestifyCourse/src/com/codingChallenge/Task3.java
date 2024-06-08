package com.codingChallenge;

import java.util.Arrays;

public class Task3 {

    public static void maxProduct(int n, int arr[]){
        //sort the array
        Arrays.sort(arr);
        int num1, num2;

        //calculate the product of 2 smallest numbers
        int product1 = arr[0] * arr[1];

        //calculate the product of 2 largest numbers
        int product2 = arr[n - 1] * arr[n -2];

        //print the pairs whose product is greater
        if(product1 > product2){
            num1 = arr[0];
            num2 = arr[1];
        }
        else {
            num1 = arr[n - 1];
            num2 = arr[n - 2];
        }
        System.out.println("Max product pair = " + num1 + " & "  + num2);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 6, 7, 0 };
        int n = arr.length;
        maxProduct(n, arr);
    }
}
