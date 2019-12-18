package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation0 (){
        testImplementation();
    }
    @Test
    public void testInheritance0(){
        testInheritance();
    }

    @Test
    public void testTeach0(){
        testTeach(10.0);
    }

    @Test
    public void testTeach1(){
        testTeach(20.0);
    }

    @Test
    public void testTeach2(){
        testTeach(35.0);
    }

    @Test
    public void testLecture0(){
        testLecture(100);
    }
    @Test
    public void testLecture1(){
        testLecture(355);
    }
    @Test
    public void testLecture2(){
        testLecture(134);
    }

    private void testImplementation() {
        Teacher teacher = new Instructor(0);
        //then
        Assert.assertTrue(teacher instanceof Teacher);
    }

    private void testInheritance() {
        Teacher teacher = new Instructor(0);
        //then
        Assert.assertTrue(teacher instanceof Person);
    }

    private void testTeach(double numberOfHours) {
        Teacher teacher = new Instructor(0, "instructor0");
        Learner student = new Student(1, "student1");
        teacher.teach(student, numberOfHours);
        // when
        long expectedHours = (long)numberOfHours;
        long actualHours = (long)student.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedHours, actualHours);
    }
    private void testLecture(double numberOfLectureHours) {
        Learner student1 = new Student(1, "student1");
        Learner student2 = new Student(2, "student2");
        Learner student3 = new Student(3, "student3");

        Learner[] learners = {student1, student2, student3};

        Teacher instructor1 = new Instructor(0, "instructor");
        // when
        instructor1.lecture(learners, numberOfLectureHours);
        long expected = (long)numberOfLectureHours/learners.length;
        long actualStudent1 = (long)student1.getTotalStudyTime();
        long actualStudent2 = (long)student1.getTotalStudyTime();
        long actualStudent3 = (long)student1.getTotalStudyTime();
        // then
        Assert.assertEquals(expected, actualStudent1);
        Assert.assertEquals(expected, actualStudent2);
        Assert.assertEquals(expected, actualStudent3);
    }
}
