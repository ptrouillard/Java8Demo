package com.pedro.java8;

import static com.pedro.java8.InterfaceWithStaticMethod.name;

/**
 * Created by ptrouillard on 19/10/2015.
 */
public class ImplementationClass implements InterfaceWithStaticMethod {

    @Override
    public void doTheJob() {
        // start by calling the name
        System.out.println(name());
    }

    public static void main(String[] args) {
        new ImplementationClass().doTheJob();
    }
}
