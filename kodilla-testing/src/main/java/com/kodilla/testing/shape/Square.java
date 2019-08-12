package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {


    double a;
    String name;

    public Square(double a, String name) {
        this.a = a;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0 &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, name);
    }

    public String getShapeName(){
        return name;
    }
    public double getField() {
        return a*a;
    }
}
