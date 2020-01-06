package com.github.curriculeon;

/* SINGLETON CLASS INITIATION*/

import java.util.ArrayList;
import java.util.List;

public final class Students extends People{
    private static final Students INSTANCE = new Students();
    public List<Person> students = new ArrayList<>();
    private Students(){
        Person ming = new Student(101, "Minghao");
        students.add(ming);
        Person shadow = new Student(102, "Shadow");
        students.add(shadow);
    }
    public static Students getInstance(){
        return INSTANCE;
    }
}

