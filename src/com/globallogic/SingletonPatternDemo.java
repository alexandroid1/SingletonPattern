package com.globallogic;

import com.globallogic.implementations.EagerInitializedSingleton;
import com.globallogic.implementations.LazyInitializedSingleton;
import com.globallogic.implementations.StaticBlockSingleton;
import com.globallogic.implementations.ThreadSafeSingleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        EagerInitializedSingleton object = EagerInitializedSingleton.getInstance();
        object.showMessage();

        StaticBlockSingleton object1 = StaticBlockSingleton.getInstance();
        object1.showMessage();

        LazyInitializedSingleton object2 = LazyInitializedSingleton.getInstance();
        object2.showMessage();

        ThreadSafeSingleton object3 = ThreadSafeSingleton.getInstance();
        object3.showMessage();
    }
}
