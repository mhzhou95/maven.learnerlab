package com.github.curriculeon;

/* SINGLETON CLASS INITIATION*/

public class Students extends People{
    private static final Students instance = new Students();
    private Students(){
        Person minghao = new Student(101, "Minghao Zhou");
        instance.add(minghao);
        Person shadow = new Student(102, "Shadow");
        instance.add(shadow);
    }
    public static Students getInstance(){
        return instance;
    }
}

