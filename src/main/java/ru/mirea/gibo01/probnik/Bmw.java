package ru.mirea.gibo01.probnik;

public class Bmw extends Car {
    protected int distance;
    protected int time;

    public Bmw(String color, int weight, boolean field, int distance, int time) {
        super(color, weight, field);
        this.distance = distance;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "distance=" + distance +
                ", time=" + time +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", field=" + field +
                '}';
    }
    @Override
    public double getSpeed() {
        return this.distance/this.time;
    }
}