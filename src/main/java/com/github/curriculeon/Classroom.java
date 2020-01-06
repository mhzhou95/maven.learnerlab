package com.github.curriculeon;

public final class Classroom extends People{
    private static final Classroom INSTANCE = new Classroom();

    public Students students = Students.getInstance();
    public Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture( students,numberOfHours);
    }
}
