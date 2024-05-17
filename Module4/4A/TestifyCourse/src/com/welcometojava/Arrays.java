package com.welcometojava;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args)
    {
        //array declaration1
        int [] array1 = new int [5];
        array1[0] = 10;
        array1[1] =12;
        array[2] = 14;
        array[3] = 16;
        System.out.println(Arrays.toString(array1));

        //array declaration2 - single dimension array
        String [] fruits = {mago, banana, orange, guava};
        System.out.println(Array.toString(fruits));

        //array declartion for double dimension arrays
        int [] [] doubleDim = new int [2] [3];
        doubleDim [0] [0] = 20;
        doubleDim [0] [1] = 30;
        System.out.println(Array.deepToString(doubleDim));

        //ArrayList
        ArrayList arr = new ArrayList();
        //ArrayList<String> arr = new ArrayList<String>(); // for streamlinning the data type you want to pass in the array
        arr.add("test");
        arr.add(10);

        //arr.remove(0);
        System.out.println(arr);




    }
}
