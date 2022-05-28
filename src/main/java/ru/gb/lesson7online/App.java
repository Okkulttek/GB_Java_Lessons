package ru.gb.lesson7online;

import ru.gb.lesson5.Employee;

import static ru.gb.lesson7online.Cat.*;

public class App {

    public static void main(String[] args) {
        Plate plate = new Plate(70);
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Обжора", 10, false);
        cat[1] = new Cat("Том", 20, false);
        cat[2] = new Cat("Балам", 13, false);


        plate.info();
        System.out.println();
        for (int i = 0; i < cat.length; i++) {
            Cat value = cat[i];
            value.eat(plate);
        }
        plate.increaseFood(10);
        plate.info();
    }
}