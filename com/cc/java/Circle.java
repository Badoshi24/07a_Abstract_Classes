package com.cc.java;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        
      //  return Math.PI*radius*radius; // variante 1    }
    return Math.pow(radius, 2);

}

private static double areaDiff(Rectangle r, Triangle t) {
    
     return r.area()- t.area();

}




}
