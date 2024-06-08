package com.welcometojava;

public class Task14_encapsulation {
    public static void main(String[] args) {

        Task14 square = new Task14();
        square.setShapeLength(12);
        int squareLength = square.getShapeLength();
        square.setShapeBreadth(6);
        int squareBreadth = square.getShapeBreadth();

        int area = squareLength * squareBreadth;
        System.out.println("The area of a square of length: "+squareLength+ " and breadth: " +squareBreadth+ " is: " +area);


    }
}
