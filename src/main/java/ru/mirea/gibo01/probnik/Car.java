package ru.mirea.gibo01.probnik;

public abstract class Car {
    protected String color;
    protected int weight;
    protected boolean field;
    public abstract double getSpeed();

    public Car(String color, int weight, boolean field) {
        this.color = color;
        this.weight = weight;
        this.field = field;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isField() {
        return field;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", field=" + field +
                '}';
    }
}