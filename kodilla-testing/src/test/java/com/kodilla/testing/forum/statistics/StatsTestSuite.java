package com.kodilla.testing.forum.statistics;


import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testUsers100() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        String a = "b";
        List<String> usersNames = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            usersNames.add(a);
        }
        when(statisticsmock.usersNames()).thenReturn(usersNames);

        //When
        stats.calculateAdvStatistics(statisticsmock);
        double usersQuantity = stats.getUsers();

        //Then
        Assert.assertEquals(100, usersQuantity, 0);
    }

    @Test
    public void testUsers0() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        List<String> usersNames = new ArrayList<String>();
        when(statisticsmock.usersNames()).thenReturn(usersNames);

        //When
        stats.calculateAdvStatistics(statisticsmock);
        double usersQuantity = stats.getUsers();

        //Then
        Assert.assertEquals(0, usersQuantity, 0);
    }

    @Test
    public void testPosts0() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        when(statisticsmock.postsCount()).thenReturn(0);

        //When
        stats.calculateAdvStatistics(statisticsmock);
        double postsQuantity = stats.getPosts();

        //Then
        Assert.assertEquals(0, postsQuantity);
    }

    @Test
    public void testPosts1000() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        when(statisticsmock.postsCount()).thenReturn(1000);

        //When
        stats.calculateAdvStatistics(statisticsmock);
        double postsQuantity = stats.getPosts();

        //Then
        Assert.assertEquals(1000, postsQuantity, 0);
    }

    @Test
    public void testComments0() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        when(statisticsmock.commentsCount()).thenReturn(0);

        //When
        stats.calculateAdvStatistics(statisticsmock);
        double commentsQuantity = stats.getComments();

        //Then
        Assert.assertEquals(0, commentsQuantity, 0);
    }

    @Test
    public void testCommentsMoreThanPosts() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        when(statisticsmock.commentsCount()).thenReturn(100);
        when(statisticsmock.postsCount()).thenReturn(10);

        //When
        stats.calculateAdvStatistics(statisticsmock);
        double postsQuantity = stats.getPosts();
        double commentsQuantity = stats.getComments();

        //Then
        Assert.assertEquals(10 ,commentsQuantity/postsQuantity, 0);
    }

    @Test
    public void testPostsMoreThanComments() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        when(statisticsmock.commentsCount()).thenReturn(10);
        when(statisticsmock.postsCount()).thenReturn(100);

        //When

        stats.calculateAdvStatistics(statisticsmock);
        double postsQuantity = stats.getPosts();
        double commentsQuantity = stats.getComments();


        //Then
        Assert.assertEquals(0.1 ,commentsQuantity/postsQuantity, 0);
    }

    @Test
    public void TestAveragePostsForUser() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        String a = "b";
        List<String> usersNames = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            usersNames.add(a);
        }
        when(statisticsmock.postsCount()).thenReturn(300);
        when(statisticsmock.usersNames()).thenReturn(usersNames);
        //When

        stats.calculateAdvStatistics(statisticsmock);
        double Avg = stats.getAveragePostsForUser();

        //Then
        Assert.assertEquals(3 , Avg , 0);
    }

    @Test
    public void TestAverageCommentsForUser() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        String a = "b";
        List<String> usersNames = new ArrayList<String>();
        for(int i=0; i<120; i++) {
            usersNames.add(a);
        }
        when(statisticsmock.commentsCount()).thenReturn(800);
        when(statisticsmock.usersNames()).thenReturn(usersNames);
        //When

        stats.calculateAdvStatistics(statisticsmock);
        double Avg = stats.getAverageCommentsForUser();
        Avg*=100;
        Avg=Math.round(Avg);
        Avg/=100;


        //Then
        Assert.assertEquals(6.67 ,Avg, 0);
    }

    @Test
    public void TestAverageCommentsForPosts() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        when(statisticsmock.commentsCount()).thenReturn(800);
        when(statisticsmock.postsCount()).thenReturn(115);
        //When

        stats.calculateAdvStatistics(statisticsmock);
        double Avg = stats.getAverageCommentsForPost();
        Avg*=100;
        Avg=Math.round(Avg);
        Avg/=100;


        //Then
        Assert.assertEquals(6.96 ,Avg, 0);
    }




}
