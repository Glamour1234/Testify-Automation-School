package com.welcometojava;


public class Task10 {
    public static void main(String[] args) {
        //testifyMethod var = new testifyMethod();
        Task10 visitor = new Task10();
        visitor.verifyVisitors("Testifyya");
    }

    public void verifyVisitors(String word) {

        if (word == "Testify") {
            System.out.println("Welcome! Your training begins now");

        } else {
            System.out.println("You are not registered for this training");

        }
    }

}






//Create a method that verify that visitors on the slack channel are coming fot testify Trainings. If they write" Testify" then
// print out a  welcome messsage if not , theuser should be shown rejection message. after creating this method,then invoke the created
// method in your main method

