package com.kodilla.testing.collection;

import org.junit.Test;
import java.util.*;
import java.lang.*;
import org.junit.*;


public class CollectionTestSuite {

    @Test
    public void testOddNumbersExterminatorEmptyList(){
    //Given
        OddNumbersExterminator empty = new OddNumbersExterminator();
        List<Integer> testList = new ArrayList<>();

    //When
        List<Integer> testList2 = empty.exterminate((ArrayList<Integer>) testList);

    //Then
        Assert.assertEquals(0, testList2.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
    //Given
        OddNumbersExterminator empty = new OddNumbersExterminator();
        List<Integer> testList = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
            testList.add(n);
        }
    //When
        List<Integer> testList2 = empty.exterminate((ArrayList<Integer>) testList);
    //Then
        Assert.assertEquals(5, testList2.size());
    }
}
