package com.github.curriculeon;

public enum Classroom {
    INSTANCE;
//    ENUM declartion of singleton

    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    void hostLecture(Teacher teacher, double numberOfHours){
        Person[] personArray = students.listToArray();
        Student[] studentArray = new Student[personArray.length];

        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = (Student) personArray[i];
        }

        teacher.lecture(studentArray, numberOfHours);
    }

    public void hostLecture(Long instructorId, double numberOfHours){
        Person person = instructors.findById(instructorId);
        Instructor instructor = (Instructor)person;
        this.hostLecture(instructor, numberOfHours);
    }

}
