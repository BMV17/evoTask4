package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StudentWithClock implements Learner {
    private Learner learner;

    public StudentWithClock(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        learner.learn();
        System.out.printf("Время учёбы: %s ", time.format(formatter));

    }
}
