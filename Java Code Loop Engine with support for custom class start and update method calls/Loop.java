package com.twisty;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Loop {
    public void runLoop(ClassesWrapper[] classes) throws IllegalAccessException, InvocationTargetException{
        final Class[] noParams = {};
        for (ClassesWrapper cls : classes
             ) {
            try {
                Method method = cls.getTheClass().getDeclaredMethod("start", noParams);
                method.invoke(cls.getInstance(), null);
            } catch (NoSuchMethodException e) {

            }
        }
        runLoop(classes, 1);
    }

    public void runLoop(ClassesWrapper[] classes, int count) throws IllegalAccessException, InvocationTargetException{
        final Class[] noParams = {};
        for (ClassesWrapper cls : classes
                ) {
            try {
                Method method = cls.getTheClass().getDeclaredMethod("update", noParams);
                method.invoke(cls.getInstance(), null);
            } catch (NoSuchMethodException e){

            }
        }
        if(count < 10){
            runLoop(classes, count + 1);
        }
    }
}
