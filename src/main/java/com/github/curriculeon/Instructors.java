package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        super();
        String[] instructorNames = {"Leon", "Ali", "Chris"};
        for (Integer id = 0;  id <instructorNames.length ; id++) {
            String instructorName = instructorNames[id];
            Instructor instructor = new Instructor(id.longValue(), instructorName);
            super.add(instructor);
        }
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
