package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Board extends Prototype {
    public void setName(String name) {
        this.name = name;
    }

    private String name;
     private Set<TasksList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Board tclone() throws CloneNotSupportedException {
        return (Board)super.clone();

    }

    public Set<TasksList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for(TasksList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board clonedBoard = (Board)super.clone();
        clonedBoard.lists = new HashSet<>();
        for(TasksList theList : lists) {
            TasksList clonedList = new TasksList(theList.getName());
            for(Task task : theList.getTasks()) {
                clonedList.getTasks().add(task);
            }
            clonedBoard.getLists().add(clonedList);
        }
        return clonedBoard;
    }
}