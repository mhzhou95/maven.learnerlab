package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {

    @Test
    public void testStudents() {
        Students students = Students.getInstance();
        String[] studentNames = {"MovingShadow", "SpeedWind", "ArkLightning"};
        List<String> listStudentNames = Arrays.asList(studentNames);
        //when
        for ( Person student : students ){
            String currentNames = student.getName();
            Boolean containsName = listStudentNames.contains(currentNames);
            Assert.assertTrue(containsName);
        }
    }
}
