package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest


public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao tasklistDao;
    private static final String LISTNAME = "Test: My ListName ";

    @Test
    public void testFindByListName() {
        //Given
        TaskList tasklist = new TaskList(LISTNAME, "Test");
        tasklistDao.save(tasklist);
        String listName = tasklist.getListName();

        //When
        List<TaskList> readTaskList = tasklistDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTaskList.size());

        //CleanUp
        int id = readTaskList.get(0).getId();
        tasklistDao.deleteById(id);
    }

}
