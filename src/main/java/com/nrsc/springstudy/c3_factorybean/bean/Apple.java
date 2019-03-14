package com.nrsc.springstudy.c3_factorybean.bean;

public class Apple {
    private String color;
    private int size;

    public Apple(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Apple() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
