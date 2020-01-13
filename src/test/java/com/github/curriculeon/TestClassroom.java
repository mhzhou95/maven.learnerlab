package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestClassroom {
    @Test
    public void testHostLecture(){
        //given
        Classroom classroom = Classroom.INSTANCE;
        Instructor instructor = new Instructor(0L, "");
        Integer numberOfStudents = Students.getInstance().listCount();

        Double numberOfHoursToLecture = 3.0;
        Double numberOfHoursLearnedPerStudents = numberOfHoursToLecture/numberOfStudents;

        //when
        classroom.hostLecture( instructor, numberOfHoursToLecture);

        for(Person person : Students.getInstance()){
            Student student = (Student)person;
            Double actualStudyTimePerStudent = student.getTotalStudyTime();

            //then
            Assert.assertEquals(actualStudyTimePerStudent, numberOfHoursLearnedPerStudents);
        }

    }
}
