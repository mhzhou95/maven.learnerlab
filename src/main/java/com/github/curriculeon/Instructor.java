package com.github.curriculeon;

public class Instructor extends Person implements Teacher {
    Instructor(long id, String name) {
        super(id, name);
    }

    Instructor(long id) {
        super(id);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/learners.length;
        for (int i = 0; i < learners.length; i++) {
            teach(learners[i], numberOfHoursPerLearner);
        }
    }
}
