package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void TestInstructors() {

        Instructors instructors = Instructors.getInstance();
        //when
        Person leon = new Instructor(101, "Leon");
        Person ali = new Instructor(102, "Ali");
        instructors.add(leon);
        instructors.add(ali);
        //then
        Assert.assertTrue(instructors.checkContains(leon));
        Assert.assertTrue(instructors.checkContains(ali));
    }
}
