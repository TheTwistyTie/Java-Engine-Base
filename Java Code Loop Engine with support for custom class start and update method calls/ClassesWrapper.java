package com.twisty;

public class ClassesWrapper {
    private Class aClass;
    private Object instance;

     ClassesWrapper(Class aClass) throws InstantiationException, IllegalAccessException {
        this.aClass = aClass;
        initialize();
    }

    private void initialize() throws InstantiationException, IllegalAccessException{
        instance = aClass.newInstance();
    }

    public Class getTheClass(){
        return aClass;
    }
    public Object getInstance(){
        return instance;
    }
}
