package com.example.test1monstarlab.bai3;

public class Square {
    private float edge;

    public Square() {
    }

    public Square(float edge) {
        this.edge = edge;
    }

    public float getEdge() {
        return edge;
    }

    public void setEdge(float edge) {
        this.edge = edge;
    }

    public void showLength() {
        System.out.println(this.edge);
    }

    public void showPerimeter() {
        float perimeter = 4 * this.edge;
        System.out.println(perimeter);
    }

    public void showArea() {
        double area = Math.pow(this.edge, 2);
        System.out.println(area);
    }

    public void showInfo() {
        showLength();
        showPerimeter();
        showArea();
    }



}
