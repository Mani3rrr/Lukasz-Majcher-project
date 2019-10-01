package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board) context.getBean("board");
        //When
        TaskList toDoList = board.getToDoList();
        toDoList.getTasks().add("toDo");
        TaskList inProgressList = board.getInProgressList();
        inProgressList.getTasks().add("inProgress");
        TaskList doneList = board.getDoneList();
        doneList.getTasks().add("done");
        //Then
        Assert.assertEquals("toDo", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("inProgress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("done", board.getDoneList().getTasks().get(0));
    }
}