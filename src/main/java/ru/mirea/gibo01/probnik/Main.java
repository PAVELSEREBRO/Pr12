package ru.mirea.gibo01.probnik;

public class Main {
    public static void main(String[] args) {
        Bmw car = new Bmw("black", 2, true, 500, 10);
        System.out.println(car);
        System.out.println("Средняя скорость автомобиля при заданных параметрах должна равняться " + car.getSpeed());
        System.out.println("Цвет машины - " + car.getColor());
        System.out.println("Масса машины = " + car.getWeight());
    }
}