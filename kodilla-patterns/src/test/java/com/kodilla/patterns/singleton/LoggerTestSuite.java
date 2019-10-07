package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {



    @BeforeClass
    public static void logg() {
        Logger.getInstance().log("System is down");
    }
    @Test
    public void testGetLastLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("System is down", lastLog);
    }
}
