package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObserverTestSuite {
    @Test
    public void notifyAboutNewTask() {
        //given
        Task student1 = new Task(new Student("Patryk Mak"));
        Task student2 = new Task(new Student("Maciej Guz"));
        Task student3 = new Task(new Student("Bartosz Spin"));
        Mentor mentor1 = new Mentor("Kamil Wilk");
        Mentor mentor2 = new Mentor("Karol Dzik");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);

        //when
        student1.addTaskToQueue("Task1");
        student2.addTaskToQueue("Task2");
        student3.addTaskToQueue("Task3");
        student3.addTaskToQueue("Task4");
        student1.addTaskToQueue("Task5");
        student2.addTaskToQueue("Task6");


        //then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());

    }

}

