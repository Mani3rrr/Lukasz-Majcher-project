package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {



        @Test
        public void testFactoryShopping() {
            //Given
            TasksFactory factory = new TasksFactory();
            //When
            Tasks shop = factory.makeTask(TasksFactory.SHOPPING);
            shop.executeTask();
            //Then
            Assert.assertEquals(true, shop.isTaskExecuted() );
            Assert.assertEquals("Shopping List", shop.getTaskName());
        }

    @Test
    public void testFactoryDriving() {
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Tasks drive = factory.makeTask(TasksFactory.DRIVING);
        //Then
        Assert.assertEquals(false, drive.isTaskExecuted() );
        Assert.assertEquals("Long Drive", drive.getTaskName());
        }

    @Test
    public void testFactoryPainting() {
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Tasks paint = factory.makeTask(TasksFactory.PAINTING);
        paint.executeTask();
        //Then
        Assert.assertEquals(true, paint.isTaskExecuted() );
        Assert.assertEquals("Painting Task", paint.getTaskName());
        }
}
