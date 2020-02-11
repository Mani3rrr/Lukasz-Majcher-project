package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){

        //Given
        Book book1 = new Book("AuthorA","Title1",2001,"1");
        Book book2 = new Book("AuthorB","Title2",2002,"2");
        Book book3 = new Book("AuthorC","Title3",2003,"3");
        Book book4 = new Book("AuthorD","Title4",2004,"4");
        Book book5 = new Book("AuthorE","Title5",2006,"5");
        Book book6 = new Book("AuthorF","Title6",2007,"5");
        Book book7 = new Book("AuthorG","Title7",2008,"5");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);

        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println(median);
        assertEquals(2004,median, 0);




    }
}