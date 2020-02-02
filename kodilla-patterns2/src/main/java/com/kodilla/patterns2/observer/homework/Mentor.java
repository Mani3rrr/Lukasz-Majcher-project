package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void notifyNewTask(Task task) {
        System.out.println( name + ". " + task.getStudent().getName() +
                " finished and sent " + task.getTask().peekLast()+ " to you. Please check it");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
