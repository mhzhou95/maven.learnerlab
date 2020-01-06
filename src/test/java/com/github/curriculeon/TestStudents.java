package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents() {
        Students students = Students.getInstance();

        //when
        Person ming = new Student(101, "Minghao");
        Person shadow = new Student(102, "Shadow");
        students.add(ming);
        students.add(shadow);
        //then
        Assert.assertTrue(students.checkContains(ming));
        Assert.assertTrue(students.checkContains(shadow));
    }
}
