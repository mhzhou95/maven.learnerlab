package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();
    public List<Person> instructors = new ArrayList<>();

    private Instructors(){
    }
    public static Instructors getInstance(){
        return INSTANCE;
    }
}
