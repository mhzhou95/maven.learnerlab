package com.github.curriculeon;

/* SINGLETON CLASS INITIATION*/

import java.util.ArrayList;
import java.util.List;

public final class Students extends People{
    private static final Students INSTANCE = new Students();
    public List<Person> students = new ArrayList<>();
    private Students(){
        System.out.println("Students Instance created");
    }
    public static Students getInstance(){
        return INSTANCE;
    }
}

