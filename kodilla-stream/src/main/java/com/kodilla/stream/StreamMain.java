package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        LocalDate date = LocalDate.of(1999,8,17);

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(forumuser -> forumuser.getUserGender()== 'M')
                .filter(forumuser -> forumuser.getUserBirth().isBefore(date))
                .filter(forumuser -> forumuser.getUserPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumuser -> forumuser));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}