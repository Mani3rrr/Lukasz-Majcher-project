package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Tasks {

    private String taskName;
    private String where;
    private String using;
    private boolean done = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public Boolean isTaskExecuted() {
        return done;
    }

    @Override
    public void executeTask() {
        done = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    public boolean isDone() {
        return done;
    }
}
