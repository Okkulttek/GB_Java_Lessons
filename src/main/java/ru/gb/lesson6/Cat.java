package ru.gb.lesson6;

public class Cat extends Animals {
    public Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    public int run; {
        if (Animals.run > 200) {
            System.out.println("Кот бегает до 200 метров");
        } else
            System.out.println(this.name + " пробежал - " + Animals.run + " м.");
    }

    public int swim; {
        if (Animals.swim > 0) {
            System.out.println("Кот не умеет плавать");
        }
    }
}
