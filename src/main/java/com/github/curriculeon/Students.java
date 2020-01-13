package com.github.curriculeon;

/* SINGLETON CLASS INITIATION*/

public final class Students extends People{
    private final static Students INSTANCE = new Students();

    private Students(){
        super();
        String[] studentNames = {"MovingShadow", "SpeedWind", "ArkLightning"};
        for (Integer id = 0; id < studentNames.length; id++) {
            String studentName = studentNames[id];
            Student student = new Student(id.longValue(), studentName);
            super.add(student);
        }
        System.out.println("Students Instance created");
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}

