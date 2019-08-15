package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

   private double a;
   private String name;

    public Circle(double a, String name) {
        this.a = a;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.a, a) == 0 &&
                Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, name);
    }

    public String getShapeName(){
        return name;
    }
    public double getField() {
        return (3.14*a*a);
    }

}
