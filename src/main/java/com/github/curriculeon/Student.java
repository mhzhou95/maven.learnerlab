package com.github.curriculeon;

public class Student extends Person implements Learner{
    double totalStudyTime;

    Student(long id, String name) {
        super(id, name);
    }

    Student(long id) {
        super(id);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
