package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "bac", 'M', LocalDate.of(1992, 5, 5), 30));
        userList.add(new ForumUser(2, "mac", 'M', LocalDate.of(1994, 5, 2), 11));
        userList.add(new ForumUser(3, "hac", 'F', LocalDate.of(2000, 6, 30), 134));
        userList.add(new ForumUser(4, "dac", 'F', LocalDate.of(1989, 8, 3), 16));
        userList.add(new ForumUser(5, "cac", 'M', LocalDate.of(1999,5,26), 5));
        userList.add(new ForumUser(6, "wac", 'M', LocalDate.of(2002,1,13), 42));
        userList.add(new ForumUser(7, "pac", 'F', LocalDate.of(1986,4,4), 23));
        userList.add(new ForumUser(8, "sac", 'M', LocalDate.of(1999,3,2), 67));
        userList.add(new ForumUser(9, "gac", 'F', LocalDate.of(2003,10,2), 25));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
