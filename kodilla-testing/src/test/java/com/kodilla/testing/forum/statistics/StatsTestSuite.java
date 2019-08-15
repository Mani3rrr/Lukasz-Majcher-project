package com.kodilla.testing.forum.statistics;

import com.sun.org.glassfish.external.statistics.Statistic;

import com.kodilla.testing.forum.statistics.Stats;
import com.kodilla.testing.weather.stub.WeatherForecast;
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
        int usersQuantity = usersNames.size();

        //Then
        Assert.assertEquals(100, usersQuantity);
    }

    @Test
    public void testUsers0() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        List<String> usersNames = new ArrayList<String>();
        when(statisticsmock.usersNames()).thenReturn(usersNames);

        //When
        int useresQuantity = usersNames.size();
        //Then
        Assert.assertEquals(0, useresQuantity);
    }

    @Test
    public void testPosts0() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        when(statisticsmock.postsCount()).thenReturn(0);

        //When
        int postsQuantity = statisticsmock.postsCount();

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
        int postsQuantity = statisticsmock.postsCount();

        //Then
        Assert.assertEquals(1000, postsQuantity);
    }

    @Test
    public void testComments0() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        when(statisticsmock.commentsCount()).thenReturn(0);

        //When
        int commentsQuantity = statisticsmock.commentsCount();

        //Then
        Assert.assertEquals(0, commentsQuantity);
    }

    @Test
    public void testCommentsMoreThanPosts() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        when(statisticsmock.commentsCount()).thenReturn(100);
        when(statisticsmock.postsCount()).thenReturn(10);

        //When
        int postsQuantity = statisticsmock.postsCount();
        int commentsQuantity = statisticsmock.commentsCount();

        //Then
        Assert.assertEquals(commentsQuantity/postsQuantity, stats.averageCommentsForPost(), 0);
    }

    @Test
    public void testPostsMoreThanComments() {
        //Given

        Statistics statisticsmock = mock(Statistics.class);
        Stats stats = new Stats();
        when(statisticsmock.commentsCount()).thenReturn(10);
        when(statisticsmock.postsCount()).thenReturn(100);

        //When
        int postsQuantity = statisticsmock.postsCount();
        int commentsQuantity = statisticsmock.commentsCount();

        //Then
        Assert.assertEquals(commentsQuantity/postsQuantity, stats.averageCommentsForPost(), 0);
    }
}
