package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private double a;
    private double h;
    private String name;

    public Triangle(double a, double h, String name) {
        this.a = a;
        this.h = h;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.h, h) == 0 &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, h, name);
    }

    public String getShapeName(){
        return name;
    }
    public double getField() {
        return a*h*0.5;
    }
}


