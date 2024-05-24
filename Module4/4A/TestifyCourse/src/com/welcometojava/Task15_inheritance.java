package com.welcometojava;

public class Task15_inheritance extends Task15 {
    public static void main(String[] args) {

        Task15 task = new Task15();
        task.food();
        task.priceOfFood();
        task.timeOfPreparation();

        Task15_inheritance task2 = new Task15_inheritance();
        task2.write();
        task2.read();

    }

    public void read(){
        System.out.println("Read me a book");

    }

    public void write(){
        System.out.println("Write me a song");
    }
}
