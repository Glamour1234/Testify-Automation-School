package com.welcometojava;

public class JavaMethods {
    public static void main(String[] args)
    {    //to acccess the properties of a class, we create an object of that class
        JavaMethods methodVar = new JavaMethods();
        methodVar.printName();
        //methodVar.myAge();
        int userAge = methodVar.ageCalculation(1998,2024);

        //The main method is not the only method in java. There are other methods that should exist alongside the main method.
        //A method in Java is a block of statement that has a name and a return type and can be executed by invoking it from some other place
        // in your program.
        // Every class needs at least one method to run a blockof code. It is an effective way to reuse your code.
    }

     public void printName(){
         System.out.println("My name is Graham");
     }

    public void myAge(int age){
        System.out.println("My age is " + age);
    }

    public int ageCalculation(int dob, int presentYear){
        int age = presentYear - dob;
        return age;
    }
}
