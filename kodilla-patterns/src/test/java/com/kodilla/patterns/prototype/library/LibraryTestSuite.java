package com.kodilla.patterns.prototype.library;


import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testgetBook() {
        //given
        //when
        //creating the TasksList for todos
        Library books = new Library("One");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> books.getBooks().add(new Book ("Title " + n, "author " + n, LocalDate.now())));

        Book book = new Book("Title 1", "author 1" , LocalDate.now());


        books.getBooks().add(book);


        Library books2= null;
        try{
            books2 = books.tclone();
            books2.setName("Two");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);}

        //making a deep copy of object board
        Library books3 = null;
        try {
            books3 = books.deepCopy();
            books3.setName("Three");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        books.getBooks().remove(book);


        //Then
        System.out.println(books);
        System.out.println(books2);
        System.out.println(books3);
        Assert.assertEquals(10, books.getBooks().size());
        Assert.assertEquals(10, books2.getBooks().size());
        Assert.assertEquals(11, books3.getBooks().size());
        Assert.assertEquals(books.getBooks(), books2.getBooks());
        Assert.assertNotEquals(books.getBooks(), books3.getBooks());
    }
    }

