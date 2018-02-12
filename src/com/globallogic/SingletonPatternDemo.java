package com.globallogic;

import com.globallogic.implementations.EagerInitializedSingleton;
import com.globallogic.implementations.LazyInitializedSingleton;
import com.globallogic.implementations.StaticBlockSingleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        EagerInitializedSingleton object = EagerInitializedSingleton.getInstance();
        object.showMessage();
        //--------------------
        StaticBlockSingleton object1 = StaticBlockSingleton.getInstance();
        object1.showMessage();
        //--------------------
        LazyInitializedSingleton object2 = LazyInitializedSingleton.getInstance();
        object2.showMessage();


    }
}
