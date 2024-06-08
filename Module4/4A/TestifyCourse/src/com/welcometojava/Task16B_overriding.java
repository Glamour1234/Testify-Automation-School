package com.welcometojava;

public class Task16B_overriding extends Task16B {

    public static void main(String[] args) {
        Task16B_overriding override = new Task16B_overriding();
        override.playChess("");
    }

    public void playTennis(String type){
        System.out.println("Your Tennis game");
    }


}
