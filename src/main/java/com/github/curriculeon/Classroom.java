//package com.github.curriculeon;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public final class Classroom extends People{
//    private static final Classroom INSTANCE = new Classroom();
//
//     Students students = Students.getInstance();
//     Instructors instructors = Instructors.getInstance();
//
//    public void hostLecture(Teacher teacher, double numberOfHours){
//        teacher.lecture((Learner[]) students.listToArray(), numberOfHours);
//    }
//
//    public void hostLecture(long id, double numberOfHours){
//        Person teacher = instructors.findById(id);
//        hostLecture((Teacher) teacher, numberOfHours);
//    }
//
//    public List<Double> getStudyMap(){
//        List<Double> listStudyTime = new ArrayList<>();
//        for (int i = 0; i < students.students.size(); i++) {
//            Student tempStudent = students.
//        }
//        return null;
//    }
//}
