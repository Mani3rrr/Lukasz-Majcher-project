package com.kodilla.patterns2.observer.homework;

public interface Queue {
    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}