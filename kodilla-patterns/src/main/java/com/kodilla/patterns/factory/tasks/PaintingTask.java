package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Tasks {

    private String taskName;
    private String whatToPaint;
    private String color;
    private boolean done = false;

    public PaintingTask(String taskName, String whatToPaint, String color) {
        this.taskName = taskName;
        this.whatToPaint = whatToPaint;
        this.color = color;
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

    public String getWhatToPaint() {
        return whatToPaint;
    }

    public String getColor() {
        return color;
    }

    public boolean isDone() {
        return done;
    }
}
