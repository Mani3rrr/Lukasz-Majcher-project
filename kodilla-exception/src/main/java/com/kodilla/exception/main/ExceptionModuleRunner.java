package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.File;
import java.io.IOException;

public class ExceptionModuleRunner {

    public static void main(String args[]){

        FileReader filereader = new FileReader();

        try { filereader.readFile();
        }catch(FileReaderException e){
            System.out.println("oh no: " + e);
        }
    }
}
