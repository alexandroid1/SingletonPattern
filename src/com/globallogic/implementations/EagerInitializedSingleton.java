package com.globallogic.implementations;

public class EagerInitializedSingleton {

    //create an object of SingleObject
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //make the constructor private so that this class cannot be
    //instantiated
    private EagerInitializedSingleton(){}

    //Get the only object available
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from EagerInitializedSingleton!");
    }
}
