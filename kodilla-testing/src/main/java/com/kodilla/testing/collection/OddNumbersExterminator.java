package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumbersExterminator {

//List<Integer> numbers = new ArrayList <>();


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        List<Integer> testList = new ArrayList<Integer>();
        for(int n = 0; n < numbers.size(); n++ ){
            if (numbers.get(n)%2==0){
                testList.add(numbers.get(n));
            }
        }
        return (ArrayList<Integer>) testList;
    }
}
