package com.welcometojava;

public class Task19C extends Task19D {
    String name = "Mary";

    public static void main(String[] args) {
        Task19C name = new Task19C();
        name.printName();
    }

    public void printName(){
        System.out.println("My name is: " +super.name);

    }

}
