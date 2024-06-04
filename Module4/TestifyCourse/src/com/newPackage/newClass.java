package com.newPackage;

import com.welcometojava.Task12;

public class newClass {
    public static void main(String[] args) {
//        Task12 access = new Task12();
//       access.accessOneMethod();

        newClass access1 = new newClass();
        access1.accessAnotherMethod();
    }

    private void accessAnotherMethod(){
        System.out.println("this is my protected method");
    }
}
 //public methods can be accessed everywhere in your project
//protected methods can be accessed only in your package, class and subclass
// Default methods can be accessed can be accessed only in your class and package
// private methods can only be accessed in your class