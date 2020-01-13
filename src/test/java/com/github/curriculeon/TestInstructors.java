package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {
    @Test
    public void TestInstructors() {

        Instructors instructors = Instructors.getInstance();
        //when
        String[] instructorNames = {"Leon", "Ali", "Chris"};
        List<String> listInstructorNames = Arrays.asList(instructorNames);

        //then
        for( Person instructor : instructors){
            String instructorName = instructor.getName();
            Boolean containsName = listInstructorNames.contains(instructorName);
            Assert.assertTrue(containsName);
        }
    }
}
