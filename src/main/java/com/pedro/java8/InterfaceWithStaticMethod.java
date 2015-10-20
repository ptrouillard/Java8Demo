package com.pedro.java8;

/**
 * Created by ptrouillard on 19/10/2015.
 */
public interface InterfaceWithStaticMethod {

    static String name() {
        return "InterfaceWithStaticMethod";
    }

    void doTheJob();

}
