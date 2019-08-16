package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class Stats {

    private double postsQuantity;
    private double commentsQuantity;
    private double usersQuantity;
    private double averagePostsForUser;
    private double averageCommentsForUser;
    private double averageCommentsForPost;


    public double getUsers() {
        return usersQuantity;
    }

    public double getPosts() {
        return postsQuantity;
    }

    public double getComments() {
        return commentsQuantity;
    }

    public double getAverageCommentsForUser() {
        return averageCommentsForUser;
    }

    public double getAverageCommentsForPost() {
        return averageCommentsForPost;
    }

    public double getAveragePostsForUser() {
        return averagePostsForUser;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        commentsQuantity = statistics.commentsCount();
        postsQuantity = statistics.postsCount();

        if (usersQuantity > 0) {
            averagePostsForUser = postsQuantity / usersQuantity;
            averageCommentsForUser = commentsQuantity / usersQuantity;
        }
        if (postsQuantity > 0) {
            averageCommentsForPost = commentsQuantity / postsQuantity;
        }

    }
}
