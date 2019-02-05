package com.twisty;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Detector detector = new Detector();
        ClassesWrapper[] classes = detector.getClasses();
        Loop mainLoop = new Loop();
        mainLoop.runLoop(classes);
    }
}
