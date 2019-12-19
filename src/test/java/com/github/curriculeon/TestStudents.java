package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents() {
        People students = Students.getInstance();
        //when
        Person minghao = new Student(101, "Minghao Zhou");
        Person shadow = new Student(102, "Shadow");
        //then
        Assert.assertTrue(students.checkContains(minghao));
        Assert.assertTrue(students.checkContains(shadow));
    }
}
