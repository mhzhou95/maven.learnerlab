package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation0(){
        testImplementation();
    }

    @Test
    public void testInheritance0(){
        testInheritance();
    }

    @Test
    public void testLearn0(){
        testLearn(10);
    }

    @Test
    public void testLearn1(){
        testLearn(20);
    }

    private void testLearn(double numberOfHours) {
        Learner student = new Student(0, "student1");
        student.learn(numberOfHours);

        // when
        long expectedHours = (long)numberOfHours;
        long actualHours = (long)student.getTotalStudyTime();
        // then
        Assert.assertEquals(expectedHours, actualHours);
    }

    private void testImplementation(){
        Person student = new Student(0);

        // then
        Assert.assertTrue(student instanceof Learner);
    }

    private void testInheritance(){
        Person student = new Student(0);

        //then
        Assert.assertTrue(student instanceof Person);
    }


}
