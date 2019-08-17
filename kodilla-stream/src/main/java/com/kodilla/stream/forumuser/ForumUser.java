package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String userName;
    private final char userGender;
    private final LocalDate userBirth;
    private final int userPosts;

    public ForumUser(int userId, String userName, char userGender, LocalDate userBirth, int userPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.userBirth = userBirth;
        this.userPosts = userPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserGender() {
        return userGender;
    }

    public LocalDate getUserBirth() {
        return userBirth;
    }

    public int getUserPosts() {
        return userPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userGender=" + userGender +
                ", userBirth=" + userBirth +
                ", userPosts=" + userPosts +
                '}';
    }
}
