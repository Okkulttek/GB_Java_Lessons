package ru.gb.lesson6;

import java.util.Objects;

public abstract class Animals {
    public String name;
    public static int run;
    public static int swim;

    public Animals(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }
}
