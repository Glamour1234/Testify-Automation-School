package com.welcometojava;

public class Task16A2_overriding extends Task16A2 {

    public static void main(String[] args) {
        Task16A2_overriding override = new Task16A2_overriding();
        override.playChess("");
    }

    public void playTennis(String type){
        System.out.println("Your Tennis game");
    }


}
