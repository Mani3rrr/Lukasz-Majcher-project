package com.kodilla.patterns.factory.tasks;

public class TasksFactory {

        public static final String  SHOPPING = "SHOPPING";
        public static final String PAINTING = "PAINTING";
        public static final String DRIVING = "DRIVING";

        public final Tasks makeTask(final String taskClass) {
            switch (taskClass) {
                case SHOPPING:
                    return new ShoppingTask("Shopping List", "chair", 2.0);
                case PAINTING:
                    return new PaintingTask("Painting Task", "Sea", "Blue");
                case DRIVING:
                    return new DrivingTask("Long Drive", "Portugal", "Car");
                default:
                    return null;
            }

        }
    }

