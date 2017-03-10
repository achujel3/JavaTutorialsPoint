package com.tutorialspoint.a1.singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Constructor instanciated once:
        List<Singleton> singletons = new ArrayList<>();
        singletons.add(Singleton.getInstance());
        singletons.add(Singleton.getInstance());
        singletons.add(Singleton.getInstance());

        // Constructor instanciated once:
        List<ClassicSingleton> classicSingletons = new ArrayList<>();
        classicSingletons.add(ClassicSingleton.getInstance());
        classicSingletons.add(ClassicSingleton.getInstance());
        classicSingletons.add(ClassicSingleton.getInstance());


        // Constructor instanciated more than once:
        List<NonSingleton> nonSingletons = new ArrayList<>();
        nonSingletons.add(new NonSingleton());
        nonSingletons.add(new NonSingleton());
        nonSingletons.add(new NonSingleton());

        for (NonSingleton nonSingleton : nonSingletons) {
            nonSingleton.demoMethod();
        }


    }

}
