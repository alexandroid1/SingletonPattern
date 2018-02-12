package com.globallogic;

import com.globallogic.implementations.EagerInitializedSingleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        EagerInitializedSingleton object = EagerInitializedSingleton.getInstance();

        //show the message
        object.showMessage();
    }
}
