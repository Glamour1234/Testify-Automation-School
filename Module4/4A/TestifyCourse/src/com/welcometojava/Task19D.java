package com.welcometojava;

public class Task19D {

    String name = "Elohor";

    public static void main(String[] args) {
        Task19D name = new Task19D();
        name.printName("Delta");

    }

    public void printName(String name){
        System.out.println("My name is: " +this.name);
        System.out.println("My genotype is: " +Task19B.genotype);

    }
}
