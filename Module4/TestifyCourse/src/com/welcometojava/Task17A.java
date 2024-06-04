package com.welcometojava;

//Login page
public abstract class Task17A {
    //Abstract Class
    //Abstract methods are methods without body
    public abstract void usernameField();
    public abstract void passwordField();
    public abstract void forgotPasswordField();
    public abstract void signInButton();

    public void rememberMeCheckBox(){

    }
    public void continueToHomePage(){

    }
    public void oauthButton(){

    }
}






//You are required to build the blueprint for your company's login page. From the discussions with the product team, all login pages will have
// a username field, password field, forgot password field, and sign-in button while other elements like remember me checkbox, continue to
// homePage, OAuth button will not be applicable to all login pages. with your knowledge of Abstract classes, Create a class that others
// developers will have to inherit from.
