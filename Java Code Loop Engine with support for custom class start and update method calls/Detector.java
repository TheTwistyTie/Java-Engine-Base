package com.twisty;
import java.io.File;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import org.apache.commons.io.filefilter.WildcardFileFilter;

public class Detector {

    public ClassesWrapper[] getClasses() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        String pathName = "/StartFiles/";
        File folder = new File("." + pathName);
        FileFilter fileFilter = new WildcardFileFilter("*.class");
        File[] listOfFiles = folder.listFiles(fileFilter);
        int numberOfFiles = listOfFiles.length;
        Class aClass;
        ClassesWrapper[] classesWrappers = new ClassesWrapper[numberOfFiles];
        for(int i = 0; i < numberOfFiles; i++){
            aClass = Class.forName("com.twisty.StartFiles." + listOfFiles[i].getName().replace(".class",""));
            classesWrappers[i] = new ClassesWrapper(aClass);
        }
        return classesWrappers;
    }
}
