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
        Teacher teacher = new Instructor(0L);
        //then
        Assert.assertTrue(teacher instanceof Teacher);
    }

    private void testInheritance() {
        Teacher teacher = new Instructor(0L);
        //then
        Assert.assertTrue(teacher instanceof Person);
    }

    private void testTeach(double numberOfHours) {
        Teacher teacher = new Instructor(0L, "instructor0");
        Learner student = new Student(1L, "student1");
        double preStudyHours = student.getTotalStudyTime();
        teacher.teach(student, numberOfHours);
        // when
        double expectedHours = numberOfHours;
        double actualHours = student.getTotalStudyTime()-preStudyHours;
        //then
        Assert.assertEquals(expectedHours, actualHours, 0);
    }
    private void testLecture(double numberOfLectureHours) {
        Learner student1 = new Student(1L, "student1");
        Learner student2 = new Student(2L, "student2");
        Learner student3 = new Student(3L, "student3");

        Learner[] learners = {student1, student2, student3};

        Teacher instructor1 = new Instructor(0L, "instructor");
        // when
        instructor1.lecture(learners, numberOfLectureHours);
        double expected = numberOfLectureHours/learners.length;
        double actualStudent1 = student1.getTotalStudyTime();
        double actualStudent2 = student1.getTotalStudyTime();
        double actualStudent3 = student1.getTotalStudyTime();
        // then
        Assert.assertEquals(expected, actualStudent1, 0);
        Assert.assertEquals(expected, actualStudent2, 0);
        Assert.assertEquals(expected, actualStudent3, 0);
    }
}
