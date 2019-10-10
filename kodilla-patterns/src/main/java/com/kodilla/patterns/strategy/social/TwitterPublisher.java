package com.kodilla.patterns.strategy.social;

import java.security.PublicKey;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share(){
        return "New Twitt";
    }
}
