package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype{
     String name;
     Set<Book> books = new HashSet<>();

    public Library( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "Libray [" + name + "]\n";
        for(Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }


    public Set<Book> getBooks() {
        return books;
    }

    public Library tclone() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<Book>();
            for(Book book : books) {
                clonedLibrary.getBooks().add(book);
            }
        return clonedLibrary;
    }

}