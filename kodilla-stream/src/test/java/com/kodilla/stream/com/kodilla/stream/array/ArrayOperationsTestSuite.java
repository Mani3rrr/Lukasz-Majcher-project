package com.kodilla.stream.com.kodilla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        //When
        double avg = ArrayOperations.getAverage(list);
        //Then
        Assert.assertEquals(9.5, avg, 0);
    }
}
