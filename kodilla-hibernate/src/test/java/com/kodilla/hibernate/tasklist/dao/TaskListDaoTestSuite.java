package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
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

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        tasklistDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        tasklistDao.deleteById(id);
    }

}
