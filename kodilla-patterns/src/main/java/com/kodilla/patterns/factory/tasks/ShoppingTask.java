package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Tasks {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean done = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isDone() {
        return done;
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
}
