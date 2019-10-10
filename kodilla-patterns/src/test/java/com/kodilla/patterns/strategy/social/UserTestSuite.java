package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testShare(){
        //Given
        User blind = new Millenials("Blind");
        User deaf = new ZGeneration("Deaf");
        User dumb = new YGeneration("Dumb");

        //When
        String blindshare = blind.sharePost();
        String deafshare = deaf.sharePost();
        String dumbshare = dumb.sharePost();

        //Then
        Assert.assertEquals("New Facebook post", blindshare);
        Assert.assertEquals("New Snap", deafshare);
        Assert.assertEquals("New Twitt", dumbshare);
    }

    @Test
    public void testSetNewPublisher(){
        User tom = new Millenials("Tom");
        String tomssocial = tom.sharePost();
        System.out.println("Tom's activity: " + tomssocial);
        tom.setNewPublisher(new TwitterPublisher());
        tomssocial = tom.sharePost();
        System.out.println("Tom's new activity: " + tomssocial);
        Assert.assertEquals("New Twitt", tomssocial);
    }
}
