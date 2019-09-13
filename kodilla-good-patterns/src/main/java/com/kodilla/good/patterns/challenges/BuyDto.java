package com.kodilla.good.patterns.challenges;

public class BuyDto {
    private User user;
    private Product product;
    private boolean isbought;

    public BuyDto(final User user, final Product product, final boolean isbought) {
        this.user = user;
        this.product = product;
        this.isbought = isbought;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isIsbought() {
        return isbought;
    }
}
