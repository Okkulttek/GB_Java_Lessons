package ru.gb.lesson6;

public class Dog extends Animals {
    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    public int run ; {
        if (Animals.run > 500) {
            System.out.println("Собака бегает до 500 метров");
        } else
            System.out.println(this.name + " пробежал - " + Animals.run + " м.");
    }

    public int swim ; {
        if (Animals.swim > 10) {
            System.out.println("Собака плавает до 10 метров");
        } else
            System.out.println(this.name + " проплыл - " + Animals.swim + " м.");
    }
}